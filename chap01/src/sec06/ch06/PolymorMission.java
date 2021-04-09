package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Cat cat = new Cat(); // 일단 객체를 만들어줌
		Pig pig = new Pig();
		Hamster hamster = new Hamster();

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
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}
