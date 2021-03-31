package sec06.ch04;

public class SwitchExam {
	public static void main(String[] args) { //switch에서는 double 사용불가 / 정수,문자열만 가능
//		switch(값)
		int val = 2;
		switch (val) {
		case 1: // 값이 1이었다면
			System.out.println("값은 1이다."); //:콜론 (시작)부터  break (끝) 까지 여러줄이어도 상관없이 다 실행
			break;
		case 2: // 케이스 값은 무조건 다르게 !
			System.out.println("값은 2이다.ㅋㅋ");
			System.out.println("값은 2이다.ㅎㅎ");
			break;
		case 3:
			System.out.println("값은 3이다.");
			break;
		default: System.out.println("값은 1~3이 아니다."); //default는 if문에서 else같은 느낌, 제일 위에 위치해도 ㄱㅊ
			break; // break 만나야 종료함, 마지막에는 break 빼기도 함 / break의 유무에 따라 위치 변경해주기 ! 
		} // default는 한 번만 쓰되, 여러줄은 가능 / default에는 값 안넣음
		System.out.println("끝");
	}

}
