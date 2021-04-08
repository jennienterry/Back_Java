package sec06.ch06;

public class StaticExam5 {
                  // main : 프로그램의 시작점
	public static void main(String[] args) {
		// new(); 하면 주소값 무조건 가지기는 함		
			
		//System.out.println(args); //주소값은 가지고 있음(컴파일러가 넣어줌), 방은 0개
		//n1의 10
		//n2의 20
		//sum() 메소드 호출하여 결과값을 콘솔에 찍으시오.
		
		StaticExam5 i1 = new StaticExam5();
		i1.n1 = 10;
		i1.n2 = 20;
//		n3 = 30; 같은 class안에 있으니까 그냥 사용할 수 있음
		System.out.println("result : " + i1.sum());

	}
	int n1;
	int n2;
//	static int n3;
	public int sum() {
		return n1+n2;
	}
	
}
