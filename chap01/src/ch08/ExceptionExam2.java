package ch08;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// Calc 객체화, div메소드 10,2 아규먼트로 호출
		// 리턴값 받고 콘솔에 출력
		Calc c = new Calc();
		int result = c.div(10, 2); // 타입 적어주기
		System.out.println(result);
	}

}

class Calc {
	int div(int n1, int n2) {
		int result = 0;
		try {
			return n1 / n2;
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally {
			System.out.println("무조건 실행");

		}
		System.out.println("try 밖 실행");
		return result;
	}
	
}


// 출력순서 물어보기 !!!!!!!!!!!