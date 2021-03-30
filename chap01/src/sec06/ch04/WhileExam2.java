package sec06.ch04;

public class WhileExam2 {

	public static void main(String[] args) {
		int i = 0;
		while (true) { // !!continue 만나면 바로 여기로 옴 !!
			i++;
			if (i == 10) {
				break; //마찬가지 break만나면 종료
			}

			if(i%2==0) { //짝수일 때
				continue; // 위에 조건식으로 다시 돌아감
			}
			System.out.println("i : " + i);
		}
		
		System.out.println("끝");
		
		
		for(int k=0; k<10; k++) {
			if(k%2==0) { //짝수일 때
			continue;
			}
			System.out.println("k : " + k);
			}
	}

}
