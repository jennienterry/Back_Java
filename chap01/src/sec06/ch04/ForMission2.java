package sec06.ch04;

public class ForMission2 {
	public static void main(String[] args) {
		// 1~3 숫자를 더하시오.
//		int sum = 0;
//		sum = sum + 1;
//		System.out.println("sum : " + sum);
//
//		sum = sum + 2;
//		System.out.println("sum : " + sum);
//
//		sum = sum + 3; // sum += 3과 같음
//		System.out.println("sum : " + sum);
		
		//for문을 이용하여 1~20 숫자를 전부 더하시오.			
			int sum = 0;
			for (int i = 1; i <21; i++) {
				//System.out.println("sum : " + sum); 계산과정 다 나옴
				sum= sum + i;}
			System.out.println("sum : " + sum); // 마지막 값 한 번 찍히는것
			
			sum = 0; // 1~100까지 짝수합 + 홀수합
			for(int i=0; i<101; i+=2) {
				sum = sum + (i+1);
				System.out.println(sum);
			}
	}

}
