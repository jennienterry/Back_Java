package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {

	public static void main(String[] args) {
		/*
		 * 돈을 주입해 주세요 : 3000 <메뉴> 0. 종료 1. 콜라 (1,000원) 2. 사이다 (1,200원) 3. 환타 (1,300원)
		 * 선택> 1 콜라를 선택하셨습니다. (남은 금액 2,000원) 선택> 3 환타를 선택하셨습니다. (남은 금액 700원) 선택> 4 잘못
		 * 선택하셨습니다. 선택> 3 금액이 부족합니다. (남은 금액 700원) 선택> 0 종료 - 남은 금액 : 700원
		 */

		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		System.out.println("돈을 주입해 주세요.");
		int balance = scan.nextInt();
		System.out.println("<메뉴>");
		System.out.println("0. 종료");
		for (int i = 0; i < menuNmArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
		}

		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			int choice = scan.nextInt();
			if (choice == 0) {
				break;
			} else if (choice > 0 && choice <= menuNmArr.length) {
			    if (balance < menuPriceArr[choice - 1]) {
					System.out.println("금액이 부족합니다.");
				} else {
					balance -= menuPriceArr[choice - 1];
					System.out.printf("%s를 선택하셨습니다. (남은 금액 %,d원)\n", menuNmArr[choice - 1], balance);
				}
			} else {
				System.out.println("메뉴가 없습니다.");
			}

		}
		System.out.printf("종료 - 남은 금액 : %,d", balance);
		scan.close();

			}

	
		
		
		}
	