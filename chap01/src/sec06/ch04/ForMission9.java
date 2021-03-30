package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
		int star = 5;

		// for문 3개로 해결 가능

		for (int i = 0; i < star; i++) {
			for (int z = star; z > i + 1; z--) {
				System.out.print("_");
			}
			for (int z = 0; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		
//		for (int i = star; i > 0; i--) {
//			for (int z = 1; z <= star; z++) {
//				if (z < i) {System.out.print("_"); //true인 동안 별표찍음
//				else {System.out.print("*");
//				}
//	         } System.out.println();
//		}
	}
}

// ____*
// ___**
// __***
// _****
// *****