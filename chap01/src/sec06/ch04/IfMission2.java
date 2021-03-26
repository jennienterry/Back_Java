package sec06.ch04;

public class IfMission2 {
	// 여자 평균 키 : 163
	// 남자 평균 키 : 175

	public static void main(String[] args) {
		String gender = "남"; // "여;"
		int height = 170; // 숫자 바꿔서 실행해보기

//		System.out.println(gender.equals("남"));
//		System.out.println(gender.equals("여"));

		if (gender.equals("남")) {
			if (height > 175) {
				System.out.println("평균미만");
			} else if (height == 175) {
				System.out.println("평균");
			} else if (height < 175) {
				System.out.println("평균초과");
			}
		} else if (gender.equals("여")) {
			if (height > 163) {
				System.out.println("평균미만");
			} else if (height == 163) {
				System.out.println("평균");
			} else if (height < 163) {
				System.out.println("평균초과");
			}

		} else {
			System.out.println("측정불가");
		}
	}
}

// * 여자 남자 따로 if 줘도 되지만 그렇게 되면 측정불가를 낼 수 없음 *
// 남, 174 > 평균미만
// 남, 175 > 평균
// 남, 176 > 평균 초과
// 여, 162 > 평균미만
// 여, 163 > 평균
// 여, 164 > 평균초과
