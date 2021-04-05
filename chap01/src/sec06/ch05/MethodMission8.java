package sec06.ch05;

public class MethodMission8 {

	public static void main(String[] args) {
//		gugudan(8);
		// 8 * 1 = 8
		// 8 * 2 = 16
		// ...
		// 8 * 9 = 72

		gugudan(4, 8); // 단 바뀔 때 -----, 개행 구분자 사용

	}

	public static void gugudan(int n1) { // n1이 구구단 8단의 8, i는 *1, *2 곱하는 수
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", n1, i, (n1 * i)); // void이기 때문에 printf 사용가능
		}
	}

	public static void gugudan(int n1, int n2) { //변수명은 대문자로 시작하면 안됨 !!
		for (int i = n1; i <= n2; i++) {
			gugudan(i);
			System.out.println();
		}
	}
}