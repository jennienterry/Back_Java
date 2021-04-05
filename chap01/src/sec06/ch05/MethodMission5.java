package sec06.ch05;

public class MethodMission5 {

	// 중복된 소스를 최대한 제거
	// 메소드 재활용 !!! (극대화 시키기)
	public static void main(String[] args) {
		// 1
//		int star = 5;
//		printStarLine(star); //*****
//		System.out.println(); //개행
//		star = 3;
//		printStarLine(star); //***
//		

		// 2
//		int star = 5;
//		printStarSquare(star);
//		// *****
//		// *****
//		// *****
//		// *****
//		// *****
//		System.out.println();
//		star = 3;
//		printStarSquare(star);
//		// ***
//		// ***
//		// ***

		
		// 3
		int star = 5;
		printStarTri(star);
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println();
		star = 3;
		printStarTri(star);
		// *
		// **
		// ***
	}

	// 1
	// 찍어라 하면 void, 값을 달라! 라고 하면 비void -> 생각해보기
	// return 타입 기준으로 생각하기 매개변수
	public static void printStarLine(int n1) { // 위 식에서 printStarLine이 혼자 쓰이기 때문에 void형임
		for (int i = 0; i < n1; i++) { // 이 메소드에서는 star가 아닌 int n1의 값을 읽기 때문에 i<star가 아니라 i<n1 이라고 비교하는 것 !
			System.out.print("*");
		}
	}

	
	// 2
	public static void printStarSquare(int n) {
		for (int i = 0; i < n; i++) {
			printStarLine(n); // = for(int z=0;z<n;z++{ System.out.print("*")} // 사용했던 메소드를 가져와서 사용가능한 경우임
			System.out.println();
		}
	}

	
	// 3
	public static void printStarTri(int n) {
		for (int z = 1; z <= n; z++) {
			for (int i = 0; i < z; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3 다른방법
		for(int i=1; i<=n; i++) {
			printStarLine(i); //식만 이 식이 쓰이는거지 위에 for문은 끝났기 때문에 계속 i=0이 아님! 이 {}식 안에서 i=1을 줬기 때문에 i=1로 쓰임
			System.out.println(); //scope 범위때문에 ↑ 가능, 호출만 하는 것이지 값까지 그대로 쓰는 것은 아님 !
		}
		
	}
}
