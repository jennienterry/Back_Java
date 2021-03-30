package sec06.ch04;

public class WhileExam {
	public static void main(String[] args) {
		//while문은 조건식이 true인 동안 반복
		
		for(int i=0; i<5; i++) { //for문은 내가 몇번 반복할지 알 때 사용
			System.out.println("i : " + i);
		}
		
		System.out.println();
		
		int i=0;
		while(i<5) {
			System.out.println("i : " + i); // while문은 언제 멈춰야하는지 알 때 사용
			i++;
		}
		
	}

}
