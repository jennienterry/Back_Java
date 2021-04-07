package sec06.ch06;

public class OverloadingExam {

	public static void main(String[] args) {
		// Calc 객체화
		// sum메소드 호출 아규먼츠는 5,10
		
		Calc c = new Calc(); //객체화 하는것 / C대문자로 시작하니까 참조변수, 주소값을 받는 변수임 !
		c.sum(5,10); //호출할 때 변수명(=주소값).메소드( , ) / void니까 = 필요없음 / * 주소값은 변수명에 !! *
		
		c.sum(5, 10, 11);
		
		c.sum(10,20,"30");
		
		
	}
	

}


class Calc {

	void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	void sum(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
		
	}
	
	int sum(int d1, int d2, String d3) {
		System.out.println(d1+d2+d3);
		return 0;
	}
}

	// 구분만 할 수 있으면 똑같은 이름의 메소드 사용해도 된다.
	// = 파라미트가 구분함* / 리턴타입은 안중요 / 갯수도 상관x