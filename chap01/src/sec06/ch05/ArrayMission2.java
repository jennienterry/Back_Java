package sec06.ch05;

public class ArrayMission2 {

	public static void main(String[] args) {
		// 정수형 배열 생성 (10칸짜리)
		// 1~10값이 순차적으로 대입 (for문 사용)
		// 각 방의 값을 콘솔 출력 (for문 사용)
		// 입력과 출력은 분리 (업무분리 !!!)
		
		int[] intArr = new int[10];
        //System.out.println(intArr[10]); 배열쓸 때는 무조건 i는 0부터 시작해야하고, 10칸 보다 큰 수를 입력하면 에러터짐 
		
		for(int i=0; i<intArr.length; i++) { // 값을 넣는거
			intArr[i] = i+1; // intArr[방호수] = 값;
		} 
		
		for(int i=0; i<intArr.length; i++) { // 값을 찍는거
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
	}

}
}
