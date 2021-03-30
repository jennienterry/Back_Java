package sec06.ch04;

public class ForMission5 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) { // 시간
			// System.out.println(); 여기 개행줘도 됨 (제일 앞 개행)
			for (int z = 1; z < 10; z++) { // 분 이라고 생각하기
				int result = i * z;
				System.out.printf("%d * %d = %d\n", i, z, result);
			}
			System.out.println(); // 제일 끝 개행

//			System.out.println("-----");
//			for(int i=0; i<8; i++) {
//				for(int z=1;z<10; z++) {
//					int j = i+2;
//					int result = i*z;
//					System.out.println(j+"*"+z+"="+result);
//		}
//		
//			}

		}
	}
}

// 2 * 1 = 2
// 한 단 끝나면 (빈칸) 찍어주기
// 9 * 9 = 81