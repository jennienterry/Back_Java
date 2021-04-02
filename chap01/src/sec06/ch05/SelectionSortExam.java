package sec06.ch05;

import java.util.Arrays;

public class SelectionSortExam {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 6, 0 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[minIdx] > arr[z]) {
					minIdx = z;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}

/*
 * 자동배열 (선택정렬)
 * 자동배열은 바로바로 스와핑하는게 아니라 index에 제일 작은 방 값을 저장해뒀다가 마지막에 스와핑함
 * 더 적게 스와핑하기 때문에 퍼포먼스가 더 좋음
 */