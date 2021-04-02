package sec06.ch04;

public class WhileExam3 {

	public static void main(String[] args) { // while문은 while(여기) 여기 바로 물어봄
		// do는 진입할 때 일단 실행 해봄
		int val = 0, sum = 0;
		do {
			val = (int) (Math.random() * 11); //먼저 실행!
			System.out.println("val : " + val);
			sum += val;
		} while (val != 0); //do while은 true 아니어도 일단 do 실행하고 진입한 후에 물어봄

		System.out.println("dowhile-sum : " + sum);
		
//		System.out.println(); //차이점 비교하기 !
//		int val = 0, sum = 0;
//		
//		while (val != 0){
//		    val = (int) (Math.random() * 11);
//			sum += val;
//		} 
//
//		System.out.println("while-sum : " + sum);
		
	}

}
