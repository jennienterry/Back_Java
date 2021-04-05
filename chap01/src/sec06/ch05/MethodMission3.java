package sec06.ch05;

public class MethodMission3 {

	public static void main(String[] args) {
		// sumAllFromTo(5,10); // sum : 45
		// sumAllFromTo(2,4); // sum : 9
//		sumAllFromTo(1,100);// sum : ?
		sumAllFromTo(4, 2); // sum : 9
		sumAllFromTo(2, 4); // sum : 9

	}

//	public static void sumAllFromTo(final int n1, final int n2) {
////		int ddd = n1; n1이름을 바꾸기보다 이렇게 값을 넘겨주고 ddd이름을 바꾸는 것이 좋음
//		int sum = 0;
//		for(int i=n1; i<=n2; i++) {
//			sum += i;
//		} System.out.printf("sum : %d\n",sum);}
//	

	// sumAllFromTo(4,2); 해도 sumAllFromTo(2,4); 해도 9가 나올 수 있도록
	public static void sumAllFromTo(int n1, int n2) {
		int sum = 0;

//		// 1
//		int min = n1;
//		int max = n2;
//		if (n1 > n2) {
//			min = n2;
//			max = n1;
//		}
//		for (int i = min; i <= max; i++) {
//			sum += i;
//		}

		// 2
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		for (int i = n1; i >= n2; i--) {
			sum += i;
		}
		System.out.printf("sum : %d\n", sum); // 둘 중에 하나만 실행되는 원리 (내가 해냈다><)
//
//		// 3
//		if (n1 > n2) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		for (int i = n1; i <= n2; i++) {
//			sum += i;
//		}
//		System.out.println("sum : " + sum);
//		
//		//4
//		int sum = (n2*(n2+1)/2)-((n1-1)*n1/2);
	}

}