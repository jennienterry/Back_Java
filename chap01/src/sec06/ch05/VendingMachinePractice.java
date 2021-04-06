package sec06.ch05;

import java.util.Scanner;

public class VendingMachinePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menu = { "콜라", "사이다", "민초라떼", "자몽에이드", "망고주스" };
		int[] price = { 1000, 1200, 3500, 4000, 4500 };

		System.out.println("돈을 주입해주세요.");
		int balance = scan.nextInt();
		System.out.println("<메뉴>");
		System.out.println("0. 종료");

		for (int i = 0; i < menu.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i + 1, menu[i], price[i]);
		}

		while (true) {
			System.out.println("메뉴를 선택해주세요.\n");
			int choice = scan.nextInt();
			if (choice == 0) {
				break;
			} else if (choice > 0 && choice <= menu.length) {
				
				if (balance < price[choice - 1]) {
					System.out.println("금액이 부족합니다.");
				} else {
					balance -= price[choice - 1];
					System.out.printf("%s를 선택하셨습니다. (남은 금액 %,d원)\n", menu[choice - 1], balance);
				}
			} else
				System.out.println("메뉴가 없습니다.");
		}
		System.out.printf("종료 - 남은금액 %,d원", balance);
		scan.close();
	}

}
