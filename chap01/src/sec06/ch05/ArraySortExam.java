package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {

	public static void main(String[] args) {
		int[] arr = {88, 65, 23, 1, 900, 42, 95}; //65와 88의 자리를 바꾼다.
		
		int temp = arr[1]; //65의 값을 temp값에 잠깐 옮겨둔다.
		arr[1] = arr[0];
		arr[0] = temp;
		System.out.println(Arrays.toString(arr));
		//나중에서는 퀵정렬로 정렬을 만든다. sort는 알고리즘을 이해하기 위해서 하는 것임
	}

}
