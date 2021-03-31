package sec06.ch04;

public class LabelLoopExam { // 이중for문

	public static void main(String[] args) {

		OUTER: //레이블label // while문에도 가능
		for (int i = 0; i < 3; i++) {
			
			for (int z = 100; z < 105; z++) {
				System.out.printf("%d - %d \n", i, z); // 그냥 break는 가장 가까운 {문}만 break
				
				if(z == 102) {
					break OUTER; //break되는 애를 지정 / continue도 똑같이 사용 가능 / 여기서 continue 랑 뭐랑 같은의미?
			}
		}
			System.out.println("dddddd");

	}
	System.out.println("끝!");
	}

}
