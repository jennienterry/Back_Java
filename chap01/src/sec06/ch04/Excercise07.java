package sec06.ch04;

import java.util.Scanner;

public class Excercise07 {

	public static void main(String[] args) {
		// while문과 scanner 이용, 키보드로부터 입력된 데이터로 예금,출금,조회 종료 기능을 제공하는 코드 작성
		
		int balance = 0; // 잔고 !!
		Scanner scanner = new Scanner(System.in);
		
		MAIN:
		while(true) {
			System.out.println("-------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------");
			System.out.print("선택> ");
			int inputVal = scanner.nextInt();
			
//			if (inputVal == 1 ) {
//				System.out.println("예금액> ");
//				int input = scanner.nextInt();
//				balance += input;			
//			}else if (inputVal == 2){
//				System.out.println("출금액> ");
//				int output = scanner.nextInt();
//				balance -= output;				
//			}else if (inputVal == 3){
//				System.out.println("잔고> " + balance);
//			}else if (inputVal == 4) {
//				run = false; //false만들어야 break! 종료가 됨
//			}else {
//				System.out.println("1~4번만 입력해주세요.");
//			}
//		}
//			System.out.println("프로그램 종료");
			
			switch (inputVal) {
			case 1:
//				System.out.print("얼마를 입력하겠습니까? : ");
//				balance = scanner.nextInt();
				System.out.println("예금액> ");
			    balance += scanner.nextInt(); // 이 식이 있어야 값을 입력할 수 있음
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + balance); // 입력하는거 x, 남아있는 잔고를 보여주면 됨
				break;
			case 4:
				System.out.println("프로그램 종료");
				break MAIN; // 그냥 break하면 switch문만 빠져나가기 때문에 계속 while로 돌아감 그래서 MAIN이름주고 전체 박살내기
			default :System.out.println("1~4번만 입력해주세요.");
				break;
			}
	}
	}
}

