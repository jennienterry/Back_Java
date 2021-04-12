package sec06.ch07;

public class AbstExam { // Animal class 같이보기
	public static void main(String[] args) {
//		Animal animal = new Animal (); //추상메소드는 객체화할 수 없다.
		Animal ani = new Cat(); // Animal이 부모이기 때문에 부모타입 사용가능
		ani.breath();
		ani.howling();

	}

}
