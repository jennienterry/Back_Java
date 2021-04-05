package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		printMenu(menuNmArr, menuPriceArr);
	}

	public static void printMenu(String[] number, int[] price) {
//		System.out.println("<메뉴>"); //1
		String str = "<메뉴>\n"; //2
		for (int i = 0; i < number.length; i++) {
//			System.out.printf("%d. %s (%,d원)\n", i + 1, number[i], price[i]); //1
//			str += String.format("%d.%s (%,d원)\n", i + 1, number[i], price[i]); //2
			str += (i+1) + "." + number[i] + " (" + price[i] + "원)\n"; //3
//		}
//		System.out.println(str);
			
	}
	}
}
