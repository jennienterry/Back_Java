package ch08;

public class ExceptionExam {
	// 터지면 런타임..
	// Exception : 실행 x, 프로그램이 멈추면 안된다 ! 예외를 두는 문법
	// 예외발생 가능성이 조금이라도 있으면 사용해주기

		public static void main(String[] args) {

			try {
				// 예외가 발생될 가능성이 높은 소스를 위치시킨다.
				System.out.println("이거는 오류나기전이니까 일단 실행");
				int result = 10 / 0; // Exception, 수학적으로 불가능하다는 오류가 뜬다.
				System.out.println("result : " + result);

			} catch (Exception e) { // e 여기에 에러정보가 드간다. / " e.printStackTrace(); " -> 실행하면 에러정보 뜬다.
				// 예외가 발생되었다면 실행될 소스 위치시킨다.
				System.out.println("예외발생!!!");

			} finally {
				// 예외가 터지든 안터지든 무조건 실행한다.

				System.out.println("무조건 실행!!!");
			}

			System.out.println("끝");
		}

	}
	// try + catch는 세트, try가 혼자올 수 없음
	// 자바 = 자바스크립트 (비동기를 동기로 실행하려고 할 때 사용하는 것)