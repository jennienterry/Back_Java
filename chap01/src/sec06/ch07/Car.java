package sec06.ch07;

/* 1. 부모타입은 자식 객체 가리킬 수 있다. (참조, 저장)
 * 2. 자식타입은 부모 객체 가리킬 수 없다.
 * 3. 변수타입은 메소으 호출 여부만 결정 !!
 */
public class Car {
	public void hoot() {
		System.out.println("빵! 빵!");
	}
}

class Bus extends Car {
	public void openDoor() {
		System.out.println("승객문을 열다.");
	}

//	@Override
//	public void hoot() {
//		System.out.println("Bus Bang! Bang!");
//	}
}

class LocalBus extends Bus {
//	@Override
//	public void hoot() {
//		System.out.println("LocalBus Bang! Bang!");
//	}
}

class Truck extends Car {
	@Override
	public void hoot() {
		System.out.println("Truck Bang! Bang!");
	}

}
