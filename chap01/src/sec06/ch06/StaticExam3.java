package sec06.ch06;

// static이 있는 것과 없는 것의 차이 알기 ! (호출 방법이 다름, 메모리에 올라가는 순서 알기)
public class StaticExam3 {
	public static void main(String[] args) {

//		StaticExam4.main(args); 하면 불러올 수 있음

		CalcInstance ci = new CalcInstance(); // static이 아니라서 객체화를 해 주어야 함
		int result = ci.sum(10, 20);
		System.out.println("result : " + result);

		int result2 = CalcStatic.sum(10, 30); // static인 경우에는 이미 한 클래스 단위로 여겨지기 때문에 객체화 할 필요 없음
		System.out.println("result2 : " + result2);
	}

}

//static은 주소값을 가지긴 하지만 찍어낼 수는 없음 (자바에서)
class CalcStatic {
	int sum2(int num1, int num2) {
		return num1 + num2;
	}

	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance {
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}

// 쓰고 싶으면 무조건 메모리에 올라가야함
// static이 안붙으면 메모리에 안올라감 -> 올리는 작업이 객체화 !
// static은 객체화 안해도 프로그램 시작하면 이미 메모리에 올라감 (객체화 필요x)
// 메소드에 static을 절대 붙이면 안되는 메소드들 ! (나머지는 다 붙이기)