package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam2 {

	public static void main(String[] args) {
		List<Card> list = new ArrayList<>(); // <Card>제약사항이 생김 / Card객체 주소값만 받는다고 <Card> / 빼낼 때도 Card주소값만 가능
		Card c1 = new Card("","");
		
		list.add(c1);
//		list.add("dddd"); // 카드타입만 받는다고 했기 때문에 String과 정수는 오류나는 것
//		list.add(1);
		
		Card c2 = list.get(0);
	}

}
