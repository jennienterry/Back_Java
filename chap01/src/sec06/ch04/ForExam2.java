package sec06.ch04;

public class ForExam2 { //중첩for문
	public static void main (String[]args) {
		for(int i=0; i<5; i++) {
			
			for(int z=0; z<5; z++) { //이 식 자체가 (위에 i값이 5) 5번 돈다고 생각하기
				System.out.printf("%d - %d\n", i,z); //안에가 다 돌아야 위에 i문장이 돌아감
			}
		}
	}

}
