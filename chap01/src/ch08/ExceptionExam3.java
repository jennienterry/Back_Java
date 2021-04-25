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
	int div(int n1, int n2) throws Exception {// 에러가 발생되면 위에 catch로 올라가서 어떻게 처리하겠냐? 하고 처리를 함
											  // throw를 안쓰면 오류가 return으로 하드코딩 되어서 나타남
		return n1 / n2;
	}
}

// 무조건 try, catch 사용해야하는 상황