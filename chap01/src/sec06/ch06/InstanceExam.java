package sec06.ch06; // package는 너와 내가 만든 것을 구분하기 위한 것
// 객체지향!!
public class InstanceExam {  // sec06.ch06.InstanceExam이 풀네임!
	/* 기본패키지는 .이 두개정도 들어가주어야 한다. */
	/* 패키지명 : 웹도메인 com.naver.프로젝트명.model.클래스명 */
	
	
	public static void main(String[] args) { /* 클래스명이 파일명과 같아야한다. f2번 누르고 파일면 변경 또는 refactor - rename */	
		/* 프로토 타입 - 자바 스크립트 
		 * 클래스타입 - 자바
		 * 클래스 하나가 객체가 될 수 있는 존재 (이름이 있으면 객체 : 경계가 있으면 객체)
		 * 인스턴스 - 객체화 된 존재 
		 * 참조타입(레퍼런스 타입)은 메모리의 주소값을 참조하여 불러온다  */
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
//		Dog/*Dog type도 가능(사용자 정의 클래스) : 레퍼런스 변수타입 !! */ d1/* 변수 명 */ = new/* 객체화를 시켜주는 키워드 */ Dog();
		/* new Dog(); -> 이렇게만 적으면 한번만 적고 끝나고 위처럼 적으면 계속 존재한다. */
//		int aaa = true; -> boolean 과 int 같이 사용 불가!!! 한번 타입을 정하면 계속 그 타입이다.
//		Dog d2 = new Dog(); /* 같은 도그의 구조를 가지고 있지만 d1 d2는 다른 주소값 다른 존재이다. 각자 다른 값을 저장 할 수 있다. */
		
      //Dog = type이 될 수 있음 // Dog 대문자로 시작하는 타입은 참조타입 reference type
	  //byte, short, int, long, float, double, char, boolean - 원시타입 primitive type
	  //dog 변수명
	  //new = 객체화를 시켜주는 키워드 // new Dog(); 자체도 객체가 될 수 있지만 바로 소멸, 주소값 없기때문 / 객체화하고 나면 실제가 됨
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		//.이 있어야 접근한다는 의미
		
		d1.bark();
		d2.bark();
		/* ddd에는 주소값이 들어있다. new 라는 키워드로 메모리에 올린다 메모리에 올리지 않으면 저장이 되지 않고 객체화가 아닌 그냥 문서가 된다. */
	}

}

// 멤버필드 (값을 저장할 수 있는 것) - 명사 담당 /이름 나이 성별 국적 키 몸무게 눈색깔 머리색길이 혈액형 등
// 멤버메소드 (값을 수정할 수 있는 것) - 동사 담당 /뛴다 잔다 얘기한다 먹는다
class Dog {
	String name;
	String jong; //전역변수 -> 멤버필드 
	int age;
	
	void bark() { //메소드 
//		String name; 지역변수
		System.out.printf("%s가 멍멍\n", name);
	}
	
}
