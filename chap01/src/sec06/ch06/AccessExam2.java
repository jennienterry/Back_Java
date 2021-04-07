package sec06.ch06;

import sec06.ch06.acc.Access2;

public class AccessExam2 {

	public static void main(String[] args) {
		Access acc = new Access();
		//acc.num = 10;
		
		acc.printNum();
		
		Access2 acc2 = new Access2();
		//원래 풀네임 적어줘야 하는데 패키지 달라서 밑줄뜨는거 import 해주기
		//public이기 때문에 패키지 달라도 가능
	}

}
