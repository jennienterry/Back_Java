package sec06.ch04;

public class ForMission7 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5 + 3); // 3~7랜덤값
		System.out.println("star = " + star);

		for (int z = 1; z <= star; z++) {
			for (int i = 0; i < z; i++) { // 중간에 i<z식이 몇번 반복하느냐임 !!! 그래서 별이 하나씩 추가로 찍혀나가는 것
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
// star = 3
// *
// **
// ***
// ...
// star = 7
// *
// **
// ***
// ****
// *****
// ******
// *******