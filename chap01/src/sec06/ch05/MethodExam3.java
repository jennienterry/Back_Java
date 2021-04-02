package sec06.ch05;

public class MethodExam3 {

	public static void main(String[] args) {
		int mon = 10;
		printSeason(mon);

	}

	public static void printSeason(int mon) {
		switch(mon) {
		case 3: case 4: case 5:
			System.out.println("봄");
//			break;
			return; // 밑에 실행 안되고 위에 호출로 다시 돌아감, printSeason(mon);으로 돌아감
		case 6: case 7: case 8:	
			System.out.println("여름");
//			break;
			return; // 값 적으려면 무조건 타입이 같이 있어야 함 !
		case 9: case 10: case 11:
			System.out.println("가을");
//			break;
			return;
		case 12: case 1: case 2:
			System.out.println("겨울");
			return;
		}
		System.out.println("잘못 입력하셨습니다.");
	}
}
