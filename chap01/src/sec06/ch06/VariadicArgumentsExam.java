package sec06.ch06;

public class VariadicArgumentsExam {

	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		int result = cal.sum(10,20); 
//      int result = cal.sum(new int[]{10,20}); 같은 식인데 더 유연함, int랑 배열 다 받으니까 
		System.out.println("result : " + result);
		result = cal.sum(10,20);
		System.out.println("result : " + result);
		result = cal.sum(10,20,30);
		System.out.println("result : " + result);
		result = cal.sum(10,20,30,40);
		System.out.println("result : " + result);
		result = cal.sum(10,20,30,40,40,40,40,40,40,40,40,40,40,40,40,40,40);
		System.out.println("result : " + result);
		
	}

}


class Calc2 {
	int sum(int... vals) { //-> int배열이 됨 ! 하지만 "int sum(int[] vals)"와는 다른개념, 이거는 int를 받는데 배열이 되는거
		int sum = 0; //vals는 가변 = 제한이 없다./ 정수형 int배열
		for(int i=0; i<vals.length;i++) {
			sum+= vals[i];
		}
		return sum;
	}
	
}