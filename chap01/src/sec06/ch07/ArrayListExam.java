package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam {

	public static void main(String[] args) {
		List list = new ArrayList();
//		List list2 = new LinkedList(); // 삽입, 삭제, 수정에 용이

		list.add(10);
		list.add(10.1);
		list.add("ddd");
		list.add(new Card("","")); //어쨌든 객체를 쓰려면 형변환을 해야한다. object로는 안되니까 형변환 하는 과정을 거치는 것임
		
		int val2 = (int) list.get(0); //object를 상속받고 있음
		System.out.println("val2 : " + val2);
		
		Object obj = list.get(1); //순서로 값을 가져옴 / get할 때는 방번호로 불러옴
		double val = (double)obj;
		System.out.println("val : " + val);
	
//		넣는건 add, 빼는건 get
		
		/*
		Box box1 = new Box();
		box1.val = 10;

		Box box2 = new Box();
		box2.val = 20;
		
		box1.nextBox = box2;
		*/
	}

}

class Box{
	int val;
	Box nextBox;
}