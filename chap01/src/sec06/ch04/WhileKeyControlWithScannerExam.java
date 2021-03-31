package sec06.ch04;

import java.util.Scanner;

public class WhileKeyControlWithScannerExam {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int speed = 0;
		System.out.println("-----------"); // while문 밖에 있으면 한 번만 실행됨, 안에 있으면 매번 실행
		System.out.println("1. 증속 | 2. 감속 | 3. 중지");
		System.out.println("-----------");

		while (true) { //무한루프 사용할 때는 break가 있어야함 !
			System.out.println("선택 : ");
			int inputVal = scan.nextInt(); // 여기서 대기. console에 수와 엔터 칠 때 까지 대기, console에 넣은 값이 들어감

			if (inputVal == 1) {
				speed++;
			} else if (inputVal == 2) {
				speed--;
			} else if (inputVal == 3) {
//				speed = 0; // 스피드를 0으로 만들고 싶으면 옆 식으로 초기화 해주기 
				break; // break는 반복문을 끝내고 반복문 뒤에 명령어 실행한다.
			} else {
				System.out.println("1,2,3번만 입력해주세요.");
				continue; // continue를 만나면 다시 선택 창 (while true)으로 돌아감
			}
			System.out.println("현재 속도 : " + speed); //continue는 이 줄을 실행 안시키기 위해서 존재, while문이라서 알아서 돈다.
		}
		System.out.println("마지막 속도 : " + speed); // 스피드 값은 계속해서 살아있다.
		System.out.println("끝!"); // 3들어가면 break라서 여기로 나오게 됨
		scan.close(); //스캐너 시작했으면 무조건 닫아줘야 한다. 아니면 오류

	}

}
