package sec06.ch06;

public class PolyExam2ani {
	/* 1. 부모타입은 자식객체 주소값을 참조할 수 있다. (가리킬 수 있다.) 
	 * 2. 자식타입은 부모객체 주소값을 참조할 수 없다. */
	public static void main(String[] args) {
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
		//Animal ni3 = new String(); 남은 안됨
		Hamster ham = (Hamster)ani2; //1이면 에러 아닌데 2면 에러남
		
		System.out.println("끝");
	
	

	}

}
