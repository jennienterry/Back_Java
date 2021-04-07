package sec06.ch06;

public class StaticExam2 {

	public static void main(String[] args) {
		Toy2 t1 = new Toy2 ();
		Toy2 t2 = new Toy2 ();
		
		System.out.println("장난감 생산 갯수 : + t1.makeCount");
		System.out.println("장난감 생산 갯수 : + t2.makeCount");
		System.out.println("장난감 생산 갯수 : + Toy2.makeCount");
	}

}


class Toy2 {
	static int makeCount; //바로 사용할 수 있는 (getter setter 안해도)
	
	Toy2(){
		makeCount++;
	}
}

class CreditCard {
	static int height;
	static int width;
	String color;
	static String brand;
	int number;
	String name;
}
//static의 객체를 만들지 않고 class명으로 밤로 호출가능
//static은 class단위로 관리된다.
//static은 