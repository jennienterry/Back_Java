package sec06.ch04;

public class IfMission3_ {
	public static void main(String[] args) {
		final int SCORE = (int) (Math.random() * 41) + 60;
		System.out.println("SCORE : " + SCORE);
		// SCORE 값은 60 ~ 100점 사이의 값이 된다. (실생할 때마다 달라진다.)

		// 91~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-")
		// 81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-")
		// 71~80 C (77점 이상은 "C+", 76~74 "C", 73~71 "C-")
		// D

		String grade = "D";
		String sign = "-";
		int sign1 = SCORE % 10;

		if (sign1 >= 7 || sign1 == 0) {
			sign = "+";
		} else if (sign1 >= 4) {
			sign = "";
		}

		if (SCORE > 90) {
			grade = "A";
		} else if (SCORE > 80) {
			grade = "B";
		} else if (SCORE > 70) {
			grade = "C";
		}
		System.out.printf("당신의 점수는 %d점으로 %s%s입니다.", SCORE, grade, sign);

	}

}

/*
 * String dGrade = "D"; char dGradeChar = '';
 * 
 * int restVal = SCORE%10; if(restVal >= 7 || restVal == 0){dGradeChar = '+';}
 * else if(restVal <= 3) {dGradeChar = '-';}
 * 
 * if(SCORE > 90) {dGrade = "A";} else if(SCORE > 80) {dGrade = "B";} else
 * if(SCORE > 70) {dGrade = "C";} else {dGradeChar = '';}
 * 
 * System.out.printf("%s%c", dGrade, dGradeChar);
 * 
 */
