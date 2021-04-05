package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	// 남자 평균 키 : 175, 여자 평균 키 : 163
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;

		do {
			System.out.print("성별 : ");
			String gender = scan.next(); // 남,여

			System.out.print("키 : ");
			int height = scan.nextInt();

			String result = chk(gender, height);
			System.out.println(result);
			// "성별: 남, 키: 170cm, 평균미만"
			// "성별: 여, 키: 163cm, 평균"

			System.out.print("계속 하시겠습니까? (y, n) : ");
			answer = scan.next();
		} while (answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}

	public static String chk(String g, int h) {
		String result = "평균";
		if (g.equals("남")) {
			int average = 175;
			if (average > h) {
				result = "평균미만";
			} else if (average < h) {
				result = "평균초과";
			}
		} else if (g.equals("여")) {
			int average = 163;
			if (average > h) {
				result = "평균미만";
			} else if (average < h) {
				result = "평균초과";
			}

		} else {
			return "측정불가";
		}
		return "성별 : " + g + ", 키 : " + h + "cm, " + result;
	}
		//sysout은 void라서 return기능이 없음 ! return은 비void일 때만 사용가능

//	=
//
//	int stand = 0;
//	String result = "평균";
//
//	switch(g){
//	case "여" : case "여자": case "woman" : case "girl":
//		stand = 163;
//		break;
//	case "남" : case "남자": case "man" : case "boy":
//		stand = 175;
//		break;
//	default:
//		return "성별을 잘못 입력하셨습니다."
//	}
//
//	if(h>stand)
//	{
//	   result = "평균초과"
//	}else if(h<stand){
//	   result = "평균미만";
//	}
//    System.out.printf("성별: %s, 키: %dcm, %s\n", g, h, result); // printf는 return기능 없이 여기다가 그냥 찍는거		
//    return String.format("성별: %s, 키: %dcm, %s", g, h, result); // = printf와 같은 기능 !
}
