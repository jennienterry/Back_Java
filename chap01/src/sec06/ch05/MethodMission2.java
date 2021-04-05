package sec06.ch05;

public class MethodMission2 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(n1,n2); // 3.3333333
		System.out.println("result : " + result); // 3.3333333
		
		n2 = 5;
		result = divide(n1,n2);
		System.out.println("result : " + result); // 2.0
		
		
		//2번문제
		System.out.println("절대값 : " + abs(10)); //10 // 이렇게 어디 소속되어 있으면 비void임 
		System.out.println("절대값 : " + abs(-10)); // 10
	}

	   //        여기 double은 나가는 값    여기 int는 받는값이니까 타입이 같아야함 (위에 보면 n1값은 int형임)
	public static double divide(int n1, int n2) {
		return (double)n1/n2; // 그냥 return n1/n2하면 소수점 날라가니까 앞에(double)해서 형변환 해줘야함 !!
		                      // int로 들어온것을 double로 내보낼 수 있음
	}
	
	public static int abs(int n1)  { // 타입, 타입명, 파라미트 무조건 있어야한다 !
		if(n1<0) {
			return n1*(-1); // 그냥 -n해도 *-n이라는 의미임 ! = return Math.abs(n1);
		}
		return n1;
	}
}
