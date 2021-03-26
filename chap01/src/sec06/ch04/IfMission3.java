package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int) (Math.random() * 20) + 81;
		System.out.println("SCORE : " + SCORE);
		// SCORE 값은 81 ~ 100점 사이의 값이 된다. (실생할 때마다 달라진다.)

		// 90~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-")
		// 81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-")

		String grade= "";

		if (SCORE >= 90) {
			if (SCORE > 96) {
				grade = "A+";
			} else if (SCORE > 93) {
				grade = "A";
			} else {
				grade = "A-";
			}
//			System.out.println("당신의 점수는 " + SCORE + "점 입니다.");
		} else if (SCORE >= 80) {
			if (SCORE > 86) {
				grade = "B+";
			} else if (SCORE > 83) {
				grade = "B";
			} else {
				grade = "B-";

			}
//			System.out.println("당신의 점수는 " + SCORE + "점으로 " + grade + " 입니다.");
		}
		System.out.printf("당신의 점수는 %d점으로 %s입니다.", SCORE, grade);

	} // m
} // c
