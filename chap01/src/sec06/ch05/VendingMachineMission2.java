package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission2 {
	public static void main(String[] args) {

		/*
		 * <메뉴> // 0. 종료 // 1. 콜라 (1,000원) // 2. 사이다 (1,200원) // 3. 환타 (1,300원) // 선택> 1
		 * // 콜라를 선택하셨습니다. 선택> 4 잘못 선택하셨습니다. 선택> 0 종료 - 사용한 금액은 : 2,300원 //
		 */

		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		System.out.println("\n<메뉴>"); // 한 번만 쓰려고 while문 밖으로 뺀 것
		System.out.println("0. 종료");
		for (int i = 0; i < menuNmArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
		}

		int usePrice = 0;
		while (true) {
			System.out.println("선택 >");
			int choice = scan.nextInt();
			if (choice == 0) {
				break;
			} else if (choice < 0 || choice > menuNmArr.length) {
				System.out.println("잘못 선택하셨습니다.");
				continue;
			}
			int selectedIdx = choice - 1;
			System.out.printf("%s를 선택하셨습니다.\n", menuNmArr[choice - 1]);
			usePrice += menuPriceArr[selectedIdx];
		}
		System.out.printf("종료 - 사용한 금액 : %,d", usePrice);
		scan.close();
	}

}
