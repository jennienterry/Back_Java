package sec06.ch06;

public class StaticExam {

	public static void main(String[] args) {
		Toy t1 = new Toy ();
		Toy t2 = new Toy ();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name);

		t2.name = "롯데"; // static은 이렇게 쓰는거 아님
		
		Toy.name = "SOC"; // 요렇게 쓰는거 -> class 차원으로 관리한다는 뜻임
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		System.out.println("Toy.name : " + Toy.name); //클래스명, 변수명, 다 접근가능하지만 class단위로 씀
	}

}

class Toy{
	static String name; //static 붙은 것은 프로그램 실행하면 메모리에 바로 올라감, 값 하나밖에 저장 못함
	                    //객체화랑 상관없이, static 붙은애와 안붙은 애는 완전히 다름
}

//static이 붙은 애들은 class 차원에서 관리한다.

//static이 안붙은애들은 instance 변수라고 한다.