package sec06.ch06;

public class StaticExam2 {

	public static void main(String[] args) {
		Toy2 t1 = new Toy2 ();
		Toy2 t2 = new Toy2 ();
//		Toy2.makeCount = 10;
		System.out.println("장난감 생산 갯수 : " + t1.makeCount);
		System.out.println("장난감 생산 갯수 : " + t2.makeCount);
		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount);
		//static의 경우 -> 외부(클래스를 벗어난 경우)에서 접근하려면 클래스명.makeCount(변수명) !
	}

}

class Toy3 { //Toy2와 Toy3은 별개인 존재가 됨 = 별개의 다른값을 저장할 수 있는 존재가 됨
	static int makeCount = 0; 
}


class Toy2 {
	static int makeCount; //바로 사용할 수 있음 (getter,setter 안해도)
	//static 붙어서 클래스명.makeCount는 무조건 한개, 변수가 늘어나지 않음 = 항변수
	//static이 붙으면 프로젝트(프로그램) 단위로,, 그냥 하나가 만들어 지는 것
	
	Toy2(){ // 같은 {} 안에서 늘려주는 것이니까 갯수는 늘어남, 이 {}밖에서 사용하면 다른 클래스가 됨
		makeCount++; // = 접근 방법이 두개라는 것 알기 / {}scope 안에서 가장 가까운 makeCount는 Toy2이기 때문에 그게 +1이 되는 것
                     // 같은 scope안에서 사용할 때는 아무것도 안붙이지만, 외부에서 접근하려면 클래스명.(변수명) 으로 접근
      //Toy3.makeCount++; 하면 Toy3이 ++되고 Toy2는 그대로 지정해준 10의 숫자를 가지게 됨
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
//static은 객체를 따로 만들지 않고 class명으로 바로 호출가능
//static은 class단위로 관리된다.