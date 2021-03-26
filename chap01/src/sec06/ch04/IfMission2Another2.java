package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
		String gender = "남"; // "여;"
		int height = 177; // 숫자 바꿔서 실행해보기

//		System.out.println(gender.equals("남"));
//		System.out.println(gender.equals("여"));
//		남자 평균 초과
//		남자 평균
//		남자 평균 미만
//		여자 	
		
		String displayResult = "평균미만";
		final int WOMAN_STAND = 159;
		final int MAN_STAND = 174;
//		final String name = "김지민"; //문자열은 "쌍따옴표"
//		char last_name = '김'; //문자는 '따옴표'
		int stand = WOMAN_STAND;
		
		if(gender.equals("남")) {
			stand = MAN_STAND;}
		
		if(height>stand) {
			displayResult = "평균초과"; // 여기서 sysout하는게 아니고 printf에 나올 값을 다시 지정해줘야함, sysout은 마지막에 !
		} else if(height==stand) {
			displayResult = "평균";
		} 
		System.out.printf("대한민국 %s자의 평균 키는 %s이고, 당신의 키는 %dcm이므로 %s 입니다.", gender, stand, height, displayResult);
		
		// \n 개행
	}// end of main
}// end of class
