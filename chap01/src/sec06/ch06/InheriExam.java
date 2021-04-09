package sec06.ch06;
//상속
//오버라이딩

public class InheriExam {
	public static void main(String[] args) {
		Cat cat = new Cat(); // 기본생성자를 호출하는 것 (컴파일러가 하나도 없을때만 자동으로 생성해줌)
		cat.name = "고양이";
		cat.age = 4;
		cat.howling();
		cat.lick();
//		KoShort ks = new KoShort(); //기본 생성자 호출
//		ks.name = "서이";
//		ks.pee();

	}
	

}

// 기본적으로 "멤버필드 -> 생성자 -> 메소드" 순으로 정렬

// 자바의 모든 객체는 가장먼저 object가 만들어짐 (=object부터 메모리에 올라감) (stack에 담기는 것)
// 그 다음에 Animal, 그 다음에 Cat
// Cat객체 주소값을 Cat
// 겉으로보면 부모부터 실행되지만 사실은 자식부터 쌓임...............................???????????

class Animal extends Object {/* extends Object 자동으로 들어가는 것, object : 자바의 최상위 객체(부모) / (object : 클래스) */
	String name;
	int age;

//	Animal(){
//		super();
//		System.out.println("Animal 생성자");
//	}

//	public Animal(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal { // 상속할 때 쓰는 키워드는 "extends", 상속받고 싶은 class명을 그 뒤에 적어주면 된다. 그러면 cat은 위 상속내용 사용가능

//	Cat() {
//		super(); //내 바로위에 있는 부모 ! / super가 가장 위에 있어야함, 생략가능한데 생략하면 자동으로 제일 위에 위치 / 부모부터 실행이 끝남
//		System.out.println("Cat 생성자");
//	} 여기 생성자들 PolymoMission 때문에 끈거

//	public Cat() { //부모가 이미 default이기 때문에 자식이 public이어도 의미없음
//		super("", 0);
//	}

	void lick() {
		System.out.printf("%s가 핥다.\n", name);
	}
	
	@Override //이걸 적으면 실수한지 안한지 알 수 있음
	void howling() {
		System.out.println("야옹");
		
	}

}
// = cat은 pee 메소드를 호출할 수 없다. 자식은 부모에게 영향을 미칠 수 없음

class KoShort extends Cat {
	KoShort(){
		super(); // = 부모생성자를 호출하라는 말
//		그래서 여기 sysout 있더라도 바로 출력하지 않고 부모 생성자를 먼저 실행시킴 !! 부모가 다 실행되고 나서 자식이 실행 되는 순서 !
	}
	
	void pee() {
		System.out.printf("%s가 소변을 본다.\n", name);
	}
}
// 부모가 늘어날 순 있지만 줄어들 순 없다. 자식이 더 많이 알 가능성이 높음
// 형제관계 없음, 무조건 위 아래 관계
// 자식의 내용이 바뀔 수는 있지만 부모는 바뀌지 않음
// 자식은 부모의 것도 상속받고, 자기의 것도 새로 추가할 수 있음

// 오버로딩 : 같은이름의 메소드를 여러개 만들 때 사용하는 것
// 오버라이딩 : 부모한테 있는 메소드인데 내가 그대로 쓰면서 안의 내용은 바꾸고 싶을 때 덮어쓰기 할 수 있는 것 
