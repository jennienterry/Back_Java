package sec06.ch04;

public class ForMission6 {

	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3;

//		System.out.println("star" + "=" + star);
		System.out.printf("star = %d\n", star);
		for (int i = 0; i < star; i++) {
			for (int z = 0; z < star; z++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}

// 3~7 랜덤값
// star = 3; (3칸짜리 별이 3줄)
// ***
// ***
// ***