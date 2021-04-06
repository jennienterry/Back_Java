package sec06.ch06;

public class InstanceExam4 {

	public static void main(String[] args) {
		// Car 객체화 2개
		// 첫번째 차 : name은 "소나타", cc는 2,000
		// 두번째 차 : name은 "911", cc는 5000
		// 첫번째 차량 drive한다.
		// 첫번째 차량 stop한다.

		Car c1 = new Car(); //주소값이 들어간 것이고, c2 주소값과 다름
		Car c2 = new Car(); //객체화 !

		
		c1 = c2; //c1=c2; 하면 같은 주소값이니까 c1==c2 에서 true가 뜸/ 없으면 false
		System.out.println(c1 == c2); /* car2의 값을 car1에 넣어준다. 그래서 car1은 덮어씌어진다.  */
		
		
		c1.name = "소나타";
		c1.cc = 2000;

		c2.name = "911";
		c2.cc = 5000;
		
		c1.drive();
		c1.stop();
		
		c2.drive();
		c2.stop();


	}
}

class Car {
	String name;
	int cc;

	void drive() { /* 보이드는 달린다를 출력하고 다시 리턴하지 않는다. */
		System.out.printf("%s는 달린다.\n", name);

	}

	void stop() {
		System.out.printf("%s는 멈춘다.\n", name);
	}
}