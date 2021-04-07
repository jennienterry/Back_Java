package sec06.ch04;

public class ForExam3 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 10, 56 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println("---------");

		// for each 문 (그냥 값만 뿌릴 때 용이)
		// "순서"가 있는 "주소값"을 가진 변수에만 사용 가능
		//  int 자리에는 배열의 타입을 적는 것임
		for (int val : arr) { // = arr이 val에 값을 하나씩 넣어줌 : 순서가 있는, 여러개의 값이 있는 애들이 올 수있음
			System.out.println(val);
			// 위와 다르게 여기서는 index값을 사용할 수 없다는 차이점이 있음, i++할 바에 for문 쓰기
			// for each는 무조건 0번방 부터 시작
		}
	}

}
