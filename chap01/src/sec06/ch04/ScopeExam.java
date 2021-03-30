package sec06.ch04;

public class ScopeExam {
	public static void main(String[] args) {
		// 스코프 (변수&상수가 살아있는 범위)

		int a = 10; // 여기부터
		int jjj = 11;
		if (a > 9) {
			System.out.println("a: " + a);

			jjj = 10; // int=jjj=10; ㄴㄴ
			System.out.println("jjj(1) : " + jjj);
		}

		System.out.println("jjj(2) : " + jjj);
		
//		int = 10;
		for(int i=0;i<10;i++) {}//여기 범위 안에서만 사용되고 나가면 i=0 의미없음//
	} // 여기까지 int a = 10;이 살아있음

}
