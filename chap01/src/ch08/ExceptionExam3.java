package ch08;

public class ExceptionExam3 {

	public static void main(String[] args) {
		Calc2 c = new Calc2();

		int result = 0;
		try {
			result = c.div(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외가 발생된다면 처리하고 싶은 내용들");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("result : " + result);

	}
}

class Calc2 {                       // 최상위 객체
	int div(int n1, int n2) throws Exception {
		return n1 / n2; //여기서 catch 부르면????????? 하드코딩이 됨
	}
}

// 무조건 try, catch 사용해야하는 상황