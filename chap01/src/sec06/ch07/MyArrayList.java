package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr;

	public MyArrayList() {
		arr = new int[0]; // 칸이 하나도 없는상태 // 참조타입 -> 기본값 null = 주소값이 없다 = 아무도 안가리키고 있다.
	} // int []일 때는 방 갯수를 나타내는 것임 !

	@Override
	public void add(int value) {
		int[] temp = new int[arr.length + 1]; // int[0]로 지금 방이 하나니까 +1해서 방을 하나 주는과정
		for (int i = 0; i < arr.length; i++) { // 값 하나씩 들어갈 때 마다 그만큼만 돌리는 것
			temp[i] = arr[i]; // temp와 arr의 방번호를 나타내는 것 ! (0번방부터 시작)
		}
		temp[arr.length] = value; // 방금 받은 value가 여기 들어가는 것 / temp는 지역변수라서 끝나면 사라짐
		arr = temp;

//		for(int v:arr) {
//			System.out.println(v);
//		} 잘 들어갔는지 확인하기 위함
	}

	public void add(int idx, int value) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < idx; i++) {
			temp[i] = arr[i];
		}
		temp[idx] = value;

		for (int i = idx; i < arr.length; i++) { //idx가 시작값이 아니라 몇번 도는지를 보기 !
			temp[i + 1] = arr[i];
		}
		arr = temp;
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

	@Override
	public int remove() {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			temp[i] = arr[i]; // arr값을 temp에 복사해주는 과정
		}
		int home = arr[arr.length - 1]; // ** 배열에서[배열길이-1 (= 방번호)]
		arr = temp;
		return home;
	}
	
	public int remove(int delVal) {
		int[] temp = new int [arr.length-1];
		for(int i=0; i<delVal; i++) {
			temp[i] = arr[i];
		}
		for(int i=delVal;i<temp.length;i++) {
			temp[i] =arr[i+1];
		}
		int lunchtime = arr[delVal]; 
		arr = temp;
		return lunchtime;
		
	}
}
