package sec06.ch03;

import java.util.Scanner;

// p.87 비교연산자
public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2); // 같거나! num2가 더 크면 true, 같아도 커도 true
		boolean result4 = (num1 < num2); // num1이 작을 때만! true, 같음=부등호가 없기때문
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		System.out.println("result4=" + result4);
		
		System.out.println("--------------------");
		
		char ch1 = 'A'; // 65
		char ch2 = 'a'; // 'a'는 십진법으로 하면 97
		boolean result5 = ch1 < ch2;
		System.out.println("result5=" + result5);
		System.out.println('a' == 97);
		System.out.println(0.1 == (double)0.1f); //false, type 다르기때문
		
		System.out.println("3.0 == 3.0f : " + (3.0 == 3.0f));
		System.out.println("3.5 == 3.5f : " + (3.5 == 3.5f));
		System.out.println("(float)3.2 == 3.2f : " + ((float)3.2 == 3.2f));
		//double과 float은 비교 불가, float으로 만들어주기
		System.out.println(Double.compare(3.21, 3.21f));
		
		// <, >, >=, <=, ==, != 원시형 숫자타입 (include char 문자포함)
		// 나머지 type끼리는 쓰면 안됨
		// * string 비교 때 == 절대 안됨 !! .equals( ) 사용하기 (자바만) * 중요 !!
		
		String str1 = new String("A"); // String str1 = "A";는 true , 참조타입은 대문자로 시작함
		String str2 = new String("A");
//		Car c = new Car();
//		Car myCar = new Car(9, 50, 100);
//		c.wheel = 3;
//		
//		
//		System.out.println("myCar.wheel : " + myCar.wheel);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str2.equals(str1) : " + str2.equals(str1)); // 위에 것과 =
	}
	

}

class Car {
	static int wheel = 4;
	int door;
	String color;
	int window;
	int people;
	Car() {
//		door = 4;
//		color = "블랙";
//		window = 4;
//		people = 5;
		this(4, "블랙", 4, 5);
	}
	Car(int door, int window, int people) {
		this.door = door;
		this.color = "블랙";
		this.window = window;
		this.people = people;
	}
	Car(int door, String color, int window, int p) {
		this.door = door;
		this.color = color;
		this.window = window;
		this.people = p;
	}
}
