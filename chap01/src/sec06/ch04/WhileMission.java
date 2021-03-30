package sec06.ch04;

public class WhileMission {

	public static void main(String[] args) {
		// 1~100 합계를 구하시오.
		
		int sum=0;
		int i=1;
		while(i<=100) {
			sum += i;
//			System.out.println("i : " + sum ); //while문 안에 있으면 계속 찍힘
			i++;
		}
		System.out.println(sum); //while문 밖에 있어야 마지막 한 번만 값이 찍히게 됨
	}

}
