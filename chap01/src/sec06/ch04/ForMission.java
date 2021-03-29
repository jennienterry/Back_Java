package sec06.ch04;

public class ForMission {
	public static void main(String[] args) {
		// for문을 이용하여 20~50숫자가 콘솔에 찍히도록
		for (int i = 20; i < 51; i++) {
			System.out.println("i : " + i);
		}

		for (int i = 0; i < 31; i++) { //30번 먼저 돌도록 설정해놓기 ! = 몇번 돌도록 할지
			System.out.println("i : " + (i + 20));
		}
		
		for (int i = 52; i <=60; i++) {
			System.out.println("i : " + (i - 28));
			//24~32 (9번 돈다)
		}
//		for(int i =0; i<9; i++) {
//			System.out.println("i : " + (i + 24));
//		}
		
	}

}