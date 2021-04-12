package sec06.ch07;

public class PolyExam2 {
	public static void main(String[]args) {
	// instanceof 는 상속관계일 때 사용하는 기능 !
	// 형변환 가능한지 안가능한지 !
//	Bus bus = (Bus)new Truck(); 불가능: Truck과 Bus는 관련이 없음 (car를 똑같이 상속받는것 뿐)
	
	
	System.out.println("----------- (1) ");
	Car car1 = new LocalBus();
	LocalBus lb1 = (LocalBus) car1; // LocalBus 지를 지에 담는거..
	System.out.println(car1 instanceof LocalBus);

	//Bus bus1 = car1; // (LocalBus보다 Bus가 부모라서 가리킬 수 있음 = 형변환 가능)
	System.out.println(car1 instanceof Bus);
	System.out.println(car1 instanceof Object);

	System.out.println("----------- (2) ");

	Car car2 = new Bus();
	LocalBus lb2 = (LocalBus) car2;
	System.out.println(car1 instanceof LocalBus); // false,false

	System.out.println("----------- (3) ");
	
	Car car3 = new Truck();
	Bus bus3 = (Bus) car3; //상속관계가 아니니까 관계가 없으므로 비교가 불가능
	Truck truck = new Truck(); // truck은 자기만 가능 (자식이 부모가 될 순 없으니까)
	//Bus bus4 = (Bus) truck;  // 서로 상속관계가 아니니까 안됨
	System.out.println(car3 instanceof Bus); // false 남이기 때문 (관계x)
	
	
//	car3.getClass()
}
}