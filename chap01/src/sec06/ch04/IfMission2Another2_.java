package sec06.ch04;

public class IfMission2Another2_ {
	public static void main(String[] args) {
		String gender = "남"; // "여;"
		int height = 162; // 숫자 바꿔서 실행해보기

//		System.out.println(gender.equals("남"));
//		System.out.println(gender.equals("여"));

		final int MAN_STAND = 176; // 매직넘버, 이거만 바꾸면 나머지 공용으로 사용가능
		final int WOMAN_STAND = 163; // final을 붙이면 다시는 수를 바꿀 수 없음
		int stand = MAN_STAND;

		if (gender.equals("여")) {
			stand = WOMAN_STAND;
		}
		
		if (height < stand) {
			System.out.printf("%s, 평균미만", gender);
		} else if (height == stand) {
			System.out.printf("%s, 평균", gender);
		} else {
			System.out.printf("%s, 평균초과", gender);
		}

	}// end of main
}// end of class
