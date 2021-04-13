package sec06.ch07;

import java.util.ArrayList;
import java.util.List;
public class ArrayListExam3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList(); //Integer(=int) 정수
		
		list.add(10); //순서가 있다 = for문, for each문 돌릴 수 있다.
		list.add(20);
		list.add(30);
		list.add(40);
		
		for(int i=0; i<list.size();i++) {
			System.out.printf("%d: %d\n",i,list.get(i));
		}
		
		System.out.println("------------");
		
		for(int num : list) {
			System.out.println(num);
		}
		

	}

}




//		Wrapper Class : 타입 시작을 대문자로 시작 (Byte,Character,Float...)
//		Integer num1 = 10;
//		int num2 = 10;
//		System.out.println(num1==num2);