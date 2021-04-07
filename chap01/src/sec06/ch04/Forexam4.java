package sec06.ch04;

public class Forexam4 {
	public static void main(String[] args) {
		String[] strArr = { "A", "B", "C", "D", "E" };

//		
//		for(int i=1; i<strArr.length;i++) {
//			System.out.println(); 
//			
		for (int i = strArr.length - 1; i >= 0; i--) {
			System.out.println(strArr[i]);
		}

		// for (int i=strArr.length; i>0; i--){
		// System.out.println(strArr[i-1]); //i-1을 하게되면 error가 남, 계속 손해보니까 퍼포먼스 별로

		for (String str : strArr) {
			System.out.println(str);
		}
	}

}
