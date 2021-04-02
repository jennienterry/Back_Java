package sec06.ch05;

public class MethodMission {

	public static void main(String[] args) {
		whoIsBig(10, 30); // 콘솔 > 30이 가장 큽니다. // 이름 앞에 타입 없으니까 void형, 타입이 없으니까 더하기 빼기 이런거 의미x무소용
		whoIsBig(10, 9); // 콘솔 > 10이 가장 큽니다.
		whoIsBig(11, 25); // 콘솔 > 25이 가장 큽니다.
		
		int big = getBigNum(10,30);
		System.out.println("big : " + big); // big : 30
		// = System.out.println("big : " + getBigNum(10,30));
		big = getBigNum(10,9);
		System.out.println("big : " + big); // big : 10
	}

	public static void whoIsBig(int n1, int n2) { //값이 2개니까 두 자리를 만들어 줘야함
		int big = n1;
		if(n1<n2) {
			big = n2;
		}
		System.out.printf("%d이 가장 큽니다.\n",big);
	}
	
	public static int getBigNum(int n1, int n2) {
		if(n1>n2) {
			return n1;
		}
		return n2;
	}
	
}
