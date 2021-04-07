package sec06.ch05;

import java.util.Scanner;
// 객체 자료
public class MethodMission10 {

	// 1
	public static void main(String[] args) { /* 클래스와 배열은 그릇이다. */
		Scanner scan = new Scanner(System.in);
		
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };

		
		//+ Drink[] drinkArr = new Drink[menuNmArr.length];
		Drink[] drinkArr = new Drink[6]; /* 여기서 타입은 드링크 타입이다. */
		/* 위 문장은 Drink타입의 배열만 올 수 있고 그 배열의 이름은 drinkArr이다. 이 Drink배열의 방을 6개 만들고 그 6개의 방을
		 * drinkArr에 넣어준다.*/
		/* 그 6개의 배열의 방을 만들기 위해서 반복문을 사용해 준다. */
		
//		Drink a = new drink();// = 계속 같은 값으로 찍힘
		for(int i=0;i<drinkArr.length;i++) {
			Drink aaa = new Drink(); //그릇. 방을 만들어준 것
			aaa.nm = menuNmArr[i]; //그릇에 담을 것들, nm과 price
			aaa.price = menuPriceArr[i];// 각 방은 drive type
			
			drinkArr[i] = aaa;
						
//			drinkArr[i]=new Drink();
//			drinkArr[i].nm = menuNmArr[i];
		}
		
		printMenu3(drinkArr);
		
		
		for(int i=0; i<drinkArr.length;i++) {
			Drink drink = drinkArr[i];
			System.out.printf("%d. %s (%,d원)\n", i+1, drink.nm, drink.price);
		} // = drinkArr[i].nm, drinkArr[i].price
		
		printMenu(menuNmArr, menuPriceArr);
		boolean run = true;
		while(run) {
			System.out.print("선택 > ");
			int selectedNum = scan.nextInt(); //true 또는 false기 때문에 type은 boolean
		}
	}

	// 1
	public static void printMenu(String[] number, int[] price) {
//		System.out.println("<메뉴>"); //1
		String str = "<메뉴>\n"; // 2
		str += "0.종료\n";
		for (int i = 0; i < number.length; i++) {
//			System.out.printf("%d. %s (%,d원)\n", i + 1, number[i], price[i]); //1 이거보다2,3 방법 사용하기
//			str += String.format("%d.%s (%,d원)\n", i + 1, number[i], price[i]); //2
			str += (i + 1) + "." + number[i] + " (" + price[i] + "원)\n"; // 3
//		}
//		System.out.println(str);

		}
	}
	
	public static void printMenu3(Drink[] drinkarray) {
		for(int i=0; i<drinkarray.length;i++) {
			System.out.printf("%d. %s (%,d원)\n",i+1, drinkarray[i].nm, drinkarray[i].price);
		}
	}
}
