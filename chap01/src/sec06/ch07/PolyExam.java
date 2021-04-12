package sec06.ch07;

public class PolyExam {

	public static void main(String[] args) {
		Car car1 = new Bus(); // /* 자식 객체의 주소값을 상속 받는다. */
	
//		Bus bus1 = (Bus)car1;
//		bus1.openDoor(); 
//		car1.openDoor(); /* 호출 불가능 : Car기준으로 봤을 때 openDoor를 모르기때문에 */ 
		 ((Bus)car1).openDoor();

		 
		Car car2 = new Car(); //자신의 주소값도 담을 수 있음
		Car car3 = new LocalBus();
		
//		Bus bus1 = (Bus)new Car(); 안됨
		Bus bus1 = (Bus)car1; //Car타입에서 Bus 타입으로 변환한 것
//		Bus bus1 = (Bus)car2; 안됨
		bus1.openDoor();
		bus1.hoot(); 
		
		Car carP = bus1;
		carP.hoot();
		car3.hoot();
		

		 
		//객체 기준으로 본다는 것 : 가르키는 주소값을 보기 + 출력할 때는 객체가 가지는 메소드를 보기 ***
		
		
		//예제 맞춰보기
		System.out.println("----------- (1) ");
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3 = truck1;
		carP3.hoot();
		
		System.out.println("----------- (2) ");
		Car carP4 = new LocalBus();
		Bus bus2 = new Bus();
		LocalBus lb = (LocalBus)bus2;
		lb.hoot();
		
		
		
		System.out.println("끝!");
	}

}
