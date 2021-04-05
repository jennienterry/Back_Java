package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 10, 11, 45 };
		System.out.println(Arrays.toString(arr));
//		= System.out.println(toString(arr));
		String result = toString(arr);
		System.out.println(result);
	}

	public static String toString(int[] arr) { // 배열 쓸 때는 for문 같이 !
		// String str = arr[0] + "," + arr[1] + ",";
		String line = "[";
		for (int i = 0; i < arr.length - 1; i++) {
			line += arr[i] + ", "; // line = line + arr[i] + ", ";
		}
		line += arr[arr.length - 1]; // 방은 4번인데 열은 5열이니까 -1
		line += "]";
		return line;
	}
//
//	=
//
//	String str = ""; = String str = Integer.toTString(arr[0]);
//	for(int i = 0;i<arr.length;i++){
//		if(!=0) {
//			str += ",";
//		}
//		str += arr[i];
//	}return String.format("[%s]",str); = return "[" + str + "]";
//}
}
