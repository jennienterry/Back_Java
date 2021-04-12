package sec06.ch07;

public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car ();
		Car car2 = new Bus ();
		Car car3 = new LocalBus ();
		Car car4 = new Truck ();

		//Bus, LocalBus 객체였다면 openDoor 메소드 호출
		//그 외에는 hoot 메소드 호출 ( 일 때 아닐 때 이기 때문에 무조건 분기 해줘야 해서 if문)
		
		// static이 아니었다면 이렇게 객체화시킨 후에 호출하기 !
//		PolyMission pm = new PolyMission (); -> 객체화
//		pm.blowKlaxon(car1);
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
	}

//	instanceof쓸 때 -> 변수명 instanceof 형변환 할 타입 (왼쪽을 오른쪽으로 바꿀 수 있냐)
	
	//메소드 만들때는 메소드만 보기 !   타입은 Car
	public static void blowKlaxon(Car c) {	
		if(c instanceof Bus) {
			Bus lb = (Bus)c; // 형변환은 최상위로 해주었을 때 가장 유연 ! // 같은 것을 가리키고 있음 but 호출범위는 아는것만 !(객체 보기)
			lb.openDoor();
//			return; 이 있으면 else가 없어도 된다.
//			((Bus)c).openDoor();
		}else {
			c.hoot();
		}
			
	}
}
