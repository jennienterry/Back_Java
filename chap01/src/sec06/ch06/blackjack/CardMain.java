package sec06.ch06.blackjack;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("spade", "K");
		System.out.println(c1); // spade (K)
//		System.out.println(c1.toString()); 
//		println(c1);
		
		
		//실제 String을 보내야 string이 적용이 된다. 참조변수들은 object 사용
		Card c2 = new Card("heart", "2");
		System.out.println(c2); // heart (2)
//		System.out.println(c2.toString()); 
//		println(c2);
		
		
		Card c3 = new Card("club", "J");
		System.out.println(c3); //club (J)
		CardDeck a = new CardDeck(); //CardDeck 실행하는 것 ! main에서만 실행
//		a.prin(); 
	}

	
//  이거는 blackjack_Card의 Override에 toString()이 왜 나오는지 보여주기 위한 것
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) { //파라미트 다르니까 일단 오버로딩 가능 !
		System.out.println("obj!!");
		String str = obj.toString();
		println(str); // = println(obj.toString());
	}
//	Object에는 기본으로 toString()때문에 주소값을 찍도록 되어있음 그래서 주소값을 찍어냄
//	근데 나는 객체가 가지는 그 값(여기서는 문자열)을 찍어내고 싶기 때문에 String으로 바꿔주는 과정을 거치는 것
	
	
	
	
}
