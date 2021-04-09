package sec06.ch06.blackjack;

public class CardDeck {

	private final Card[] CARD_ARR = new Card[52]; // final은 배열이름규칙이 대문자여야함 /static : 객체생성이랑만 관계없이 혼자, 하나다

	public CardDeck() {
		String[] pattern = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] symbol = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

//		for (int i = 0; i < CARD_ARR.length; i++) {
//			Card A = new Card(symbol[i % 13], pattern[(int) (i / 13)]);
//			CARD_ARR[i] = A;
//		}

//		int room_n=0;
		for(int i=0; i<pattern.length; i++) { //이 방법 쓰자,,
			for (int z=0; z<symbol.length;z++) {
				Card c = new Card(pattern[i], symbol[z]);
				CARD_ARR[i*symbol.length+z] = c;
				// = CARD_ARR[room_n++] = c;
			}
		}
	}

	public void prin() { //출력
		for (int i = 0; i < CARD_ARR.length; i++) {
			System.out.println(CARD_ARR[i]);
		}
	}

}
