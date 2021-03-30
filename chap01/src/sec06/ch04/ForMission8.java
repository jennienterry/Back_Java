package sec06.ch04;

public class ForMission8 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5 + 3);
		System.out.println("star = " + star);

		for (int z = star; z > 0; z--) {
			for (int i = z ; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int z = 0; z <star; z++) {
			for (int i = z ; i <star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int z = star; z >0 ; z--) {
			for (int i = 0 ; i <z; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

// star = 4
// ****
// ***
// **
// *
