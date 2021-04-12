package sec06.ch06.blackjack;

public class CardDeck {

	private final Card[] CARD_ARR = new Card[52]; // final은 배열이름규칙이 대문자여야함 /static : 객체생성이랑만 관계없이 혼자, 하나다
													// final이라서 객체를 생성할 때 주소값 줘야한다. (아니면 생성자 이용하기)

	public CardDeck() {
		String[] pattern = { "Spades", "Hearts", "Diamonds", "Clubs" }; // 지역변수는 (쓰면 없어지니까) public의미가 없음, 전역변수만 public
																		// 사용가능 (final은 가능)
		String[] symbol = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

//		for (int i = 0; i < CARD_ARR.length; i++) {
//			Card A = new Card(symbol[i % 13], pattern[(int) (i / 13)]);
//			CARD_ARR[i] = A;
//		}

		int room_n = 0;
		for (int i = 0; i < pattern.length; i++) { // 이 방법 쓰자,,
			for (int z = 0; z < symbol.length; z++) {
				Card c = new Card(pattern[i], symbol[z]);
//				CARD_ARR[i*symbol.length+z] = c;
				CARD_ARR[room_n++] = c;
			}
		}

		for (int i = 0; i < CARD_ARR.length; i++) {
			System.out.println(CARD_ARR[i]); // 프린트 해주기 !!!
		}
	}

//	public void prin() {
//		for (int i = 0; i < CARD_ARR.length; i++) {
//			System.out.println(CARD_ARR[i]);
//		}
//	}
	
	
	
	
//	// 1번 방법
//	public int getRandomIdx() {
//		return (int) (Math.random() * CARD_ARR.length);
//	}
//
//	public Card getOneCard() {
//		Card c = null;
//		int idx = 0;
//		do { idx = getRandomIdx();
//			c = CARD_ARR[idx];
//		} while(c==null);
//		CARD_ARR[idx] = null;
//		return c;
//	}
	
	// 2번 방법 (재귀함수, 중복제거)
	public Card getOneCard() {
		int idx = (int)(Math.random()*CARD_ARR.length);
		Card deck = CARD_ARR[idx];
		if(deck==null) {
			return getOneCard();
		}else {CARD_ARR[idx]=null;
		return deck;
		}
	}
	
//	// 3번 방법
//	public Card getOneCard() {
//		int R = (int)(Math.random() * CARD_ARR.length);
//		while (CARD_ARR[R]) == null) {R = (int)(Math.random()*CARD_ARR.length);}
// 	}
//
//	// 4번 방법
//	public Card getOneCare() {
//		int R;
//		do {R=(int)(Math.random()*CARD_ARR.length);}while(CARD_ARR[R] ==null);
//		Card c = CARD_ARR[R];
//		CARD_ARR[R] = null;
//		return c;
//	}
	
	
	public void printAll() {
		for(Card c : CARD_ARR) {
			System.out.println(c);
		}
		
	}

}
