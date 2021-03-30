package sec06.ch04;

public class WhileMission2 {

	public static void main(String[] args) {
		// 0이 아니면 계속 sum에 더해주세요. (0나올때 까지 반복문 돌리라.)
		// sum : 지금까지 더한 값 출력
		
		int sum = 0;
		while (true) { // 조건식에 true가 들어가므로 무한 반복
			int val = (int) (Math.random() * 11); // while 한바퀴 돌때마다 val 값 랜덤으로 초기화
			System.out.println("val : " + val); // val 값 찍어주기
			if (val == 0) break; // val 값이 0일때 while문 탈출!
			sum += val; // sum에다가 val 값 더해주기
		}
		System.out.println("sum :" + sum); // sum값 뽑아주기
		

		// 방법2
//		int sum = 0; 
//		int val = (int)(Math.random()*11);// 0~10사이 랜덤값이 나오도록 함
//		System.out.println("val : " + val);
//		
//		while(val!=0) {
//			sum = sum + val;
//			val=(int)(Math.random()*11);
//			System.out.println("val : " + val);
//		}
//		System.out.println("sum : " + sum);
//		

	}

}
