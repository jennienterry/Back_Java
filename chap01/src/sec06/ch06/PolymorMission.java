package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Animal cat = new Cat(); // 일단 객체를 만들어줌
		Animal pig = new Pig();
		Animal hamster = new Hamster(); // 상속관계 (다형성)라서 가능
		// 3번특징. 주소값은 Hamster지만 타입이 Animal이기 때문에  Animal이 아는 만큼의 메소드만 사용가능
		
		// 새롭게 햄스터 객체 만들지 않고, 8번라인의 hamster변수에 저장된 주소값을 활용하여 runRail 메소드 호출
		Hamster ham = (Hamster)hamster; // 결국 같은 객체, 주소값을 가지게 되는 것
		//8번줄 처럼 Animal 주소값도 가질 수 있음
		ham.runRail();
		pig.howling();
		
//		Hamster hhh = (Hamster)pig; 관계가 없기 (상속관계x) 때문에 에러난다.
		
		System.out.println(hamster instanceof Hamster); // 가능하면 true (형변환 가능한지 안한지)
		System.out.println(pig instanceof Animal); // true / 아니라면 false
		
		/*
		 * static 없을경우 PolymoMission home = new PolymoMission();
		 * home.cry(cat);
		 * home.cry(pig);
		 * home.cry(hamster);
		 * PolymorMission.cry(cat) 외부에서 접근하고 싶었으면 이렇게 사용하기
		 */

		cry(cat); // 괄호 있으면 메소드, 없으면 변수
		cry(pig); // 주소값 접근없이 단독으로 사용하니까 static이 붙은 메소드라는 것을 알 수 있음
		cry(hamster);

//		Animal p = cat;
	}

//	void cry(Cat cat) {
//		cat.howling();
//	}
//	

	static void cry(Animal p) { // Animal을 상속받을 거니까 Animal 타입
		p.howling(); // 먼저, 메소드 생성 해주기 !
	}
}

class Pig extends Animal { // InheriExam에 있는 Animal을 상속받는 것
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}


// ani로 Hamster 객체 주소값이 들어오면 howling 메소드 말고 runRail 메소드로 호출, 다른 객체들은 howling 메소드 호출
	static void cry(Animal ani) {
		ani.howling();
		
	}
}

class Hamster extends Animal{
	int nickname;
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
}




//class Hamster extends Animal {
//	@Override
//	void howling() {
//		System.out.println("찍! 찍!");
//	}
//}
