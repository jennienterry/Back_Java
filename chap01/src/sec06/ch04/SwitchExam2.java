package sec06.ch04;

public class SwitchExam2 {
	public static void main(String[] args) {
		String habit = "수영"; // if문에서는 string.equals 써야함! 문자열 비교할 때는 switch문이 편함

		switch (habit) {
		case "수영":
		case "등산":
			System.out.println("건강한 취미입니다.");
			break;
		case "술":
		case "담배":
			System.out.println("비건전한 취미입니다.");
			break;
		}
	}

}
 
//int val = 7;
//if(val >0 && val <=10) {} 범위 넓은 수 비교는 if문
//
//switch(val)
//case1, case2 다 따로 써야함