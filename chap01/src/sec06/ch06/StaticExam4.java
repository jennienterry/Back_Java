package sec06.ch06;

//메소드에 static을 절대 붙이면 안되는 메소드들 !!! (나머지는 다 붙이기) 파악하기 !
public class StaticExam4 {

	public static void main(String[] args) {
		// CalcInstance2 객체화
		// num1 = 10, num2 = 20;
		// 더한 값을 콘솔에 출력 !

		CalcInstance2 ci2 = new CalcInstance2(); // static 없는 애들은 문서일 뿐이기 때문에 무조건 객체화 먼저 !
		ci2.num1 = 10; // 그 객체한테 접근하려면 무조건 "주소값(변수명).메소드(또는 멤버필드이름)"
		ci2.num2 = 20;
//		int result = ci2.sum();	-> 이렇게 하면 sysout에 result를 찍어주기 !
		System.out.println("ci2.sum : " + ci2.sum()); // 값을 주지 않았기 때문에 sum()

		// c2.num1 = 20; , c2.num2 = 40; 객체화 했을 경우에는 이렇게 줘도 되지만 static이 붙어있기 때문에 아래처럼 주소값으로 접근해도 됨
		CalcStatic2.num1 = 20;
		CalcStatic2.num2 = 40;
		CalcStatic2 cs2 = new CalcStatic2();
		int result = cs2.sum();
		System.out.println("result : " + result);
		String.format("%d", result);  // 얘는 static 타입
      //클래스명.format(String값 받기), static 붙어있기 때문에 바로 사용가능
		
      //String str = new String();
	  //str.format("%d", result); // static 안붙었을 경우에는 이렇게 사용
		
	}
}

class CalcStatic2 {
	static int num1; // static이 안붙어 있으면 객체화 해야 올라갈 수 있기 때문에 static붙은 것이 더 우선이 됨 (아닐경우 다른 static에 빨간줄)
	static int num2; // 기본값 0
                     // static은 마지막에 넣은 값으로 통일됨 !!!
	
	static int sum() {
		return num1 + num2;
		// return this.num1 + this.num2도 가능 ! but, static에서는 this. 안됨 (의미x)
		// this.은 객체 자기자신의 ~ 라는 뜻이므로, 객체 생성 없이 쓸 수 있는 static 메소드에서는 오류가 날 수 있기때문에 붙일 수 없다.
		// this() : 생성자 호출
		// this. : 멤버필드 혹은 멤버메소드 접근
		// this 없으면 가장 가까운 멤버필드에 접근
		
		// static 붙은 멤버필드만 static 메소드 안에 쓸 수 있다.
		
		// static이 붙은 메소드는 instance 변수(멤버필드)를 사용할 수 없다.
		// static 메소드는 static 변수만 쓸 수 있다.
	}
	
	static void printStr(String str) {
		
	}
}

class CalcInstance2 {
	int num1; // 원래는 모든 멤버변수(멤버필드)에 private하고 setter, getter해야 함 (보안을 위해서)
	int num2;

	int sum() {
		return this.num1 + this.num2; // instance 메소드에서는 static 변수에 접근 가능하다.
		//여기는 this.사용가능 
	}

	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}