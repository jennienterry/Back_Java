package sec06.ch07;
	  // 추상메소드를 포함한 클래스일 경우 무조건 abstract 붙여줘야한다 !
public abstract class Animal {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void breath () {
		System.out.println("숨쉰다.");
	}
	
	public abstract void howling(); // 선언부만 있는 것 : 추상메소드
//	{System.out.println("울다");
//	}
}

class Dog extends Animal {

	@Override
	public void howling() {
		System.out.println("멍~ 멍~");
	}
	
}

class Cat extends Animal {

	@Override
	public void howling() {
		System.out.println("야옹~~ 야옹~~");
	}
	
}


/* 추상클래스
 * 1. 객체화를 할 수 없다.
 * 2. 부모 것에 대해서 무조건 오버라이딩 해줘야 한다. (강제성ㅇ)
 * 3. 구현부와 같이 존재할 수 있으면 abstract 추상클래스
 * 4. 구현부와 같이 존재하지 못한다면 interface
 * 5. 추상메소드가 없어도 클래스 앞에 abstract를 붙일 수는 있음 (객체화를 위해서)
 */

//abstract class Car {
//	
//	private String name;
//	private int price;
//	
//	public abstract void run();
//	
//	public abstract void stop();
//	
//	public abstract void openDoor();
//	
//	public void aaa() {
//		
//	}
//}
//
//class Sonata extends Car {
//
//	@Override
//	public void run() {
//		
//	}
//
//	@Override
//	public void stop() {
//		
//	}
//
//	@Override
//	public void openDoor() {
//		
//	}
//	
//}