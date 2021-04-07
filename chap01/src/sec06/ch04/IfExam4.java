package sec06.ch04;

public class IfExam4 {

	public static void main(String[] args) {
		// 삼항식
		System.out.println(abs(-10));
		System.out.println(abs(7));
	}

	public static int abs(int val) {
		return val < 0 ? -val : val; // 구분은 ?와 :으로만
//              조건식 ? true면 이거사용 : false면 이거사용
		
		
//		if(val <0) {
//			return -val;
//		}
//		return val;
		
//		MethodMission2에 있는 abs와 비교하기 !
	}
}
