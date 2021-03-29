package sec06.ch04;

public class SwitchMission {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; //.() 있으면 메소드
		//random에서 1 안나옴 (0.01~0.999) / 4곱하니까 3까지만 나오고, +8이니까 무조건 8~11사이 숫자만 나옴
		// 8~11 사이 정수값이 time 변수에 대입된다.
		System.out.println("time : " + time);
		switch(time) {
		case 8 :
			System.out.println("출근을 합니다.");
			break;
		case 9 :
			System.out.println("회의를 합니다.");
			break;
		case 10 :
			System.out.println("업무를 봅니다.");
			break;
		default :
			System.out.println("외근을 나갑니다.");
			//break;
		}
		

		
		//time 8이면 "출근합니다."
		//time 9이면 "회의를 합니다."
		//time 10이면 "업무를 봅니다."
		//나머지 시간이면 "외근을 나갑니다."
		
	} //m
} //c
