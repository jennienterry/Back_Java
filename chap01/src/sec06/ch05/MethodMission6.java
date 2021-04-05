package sec06.ch05;

public class MethodMission6 {
	public static void main(String[]args) {
		 int score = getRandomScore(50,100);
		 //50~100 사이의 랜덤숫자가 리턴되도록 세팅
		 
		 char grade = getGrade(score);
		 // 90점 이상이면 'A'
		 // 80점 이상이면 'B'
		 // 70점 이상이면 'C'
		 // 60점 이상이면 'D'
		 // 나머지 'E'
		 char grade2 = getGradeSign(score);
		 // ?8 이상이거나 100점이면 '+'
		 // ?3 이하이면 '-'
		 // 나머지 ' ' 빈칸이 리턴 되도록
		 
		 System.out.printf("%d : %c%c\n",score, grade, grade2);
	}
	

	
	public static int getRandomScore(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1))+n1;} //최대값-최소값+1
	
	public static char getGrade(int score) {
		char grade = 'E';
		if(score>=90) {
			grade = 'A';
		}else if (score>=80) {
			grade = 'B';
		}else if (score>=70) {
			grade = 'C';
		}else if (score>=60) {
			grade = 'D';
		}return grade;
		
//	switch(score /10){
//		case 10: case 9: return 'A';
//		case 8: return'B';
//		case 7: return'C';
//		case 6: return'D';
//	}   return 'E';
	}
	
	public static char getGradeSign(int score) {
		int mod = score%10; //일의자리 숫자
		if(score ==100 || mod>=8) {
			return '+';
		}else if(mod<=3) {
			return'-';
		}
		return ' ';
	}
}
