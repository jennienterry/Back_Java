package sec06.ch05;

public class MethodExam2 {

	public static void main(String[] args) { //리턴타입: void, 비void / 파라미터:o,x -> 총 4가지 타입의 메소드를 만들 수 있음
		int n1 = 10, n2 = 30;

		voidSum(n1,n2); //여기는 호출임 / void는 앞에 = 쓰면 안됨 !!! 값을 받겠다는 의미 자체가 없음, return 없음
		voidSum(1,2);
		
		System.out.println("-------"); // void형은 2차가공을 못함
		
		
		int result = intSum(n1,n2); //이 자체가 그 값이 됨 40 // 호출된 intSum만 보고 void, 타입은 int, 파라미트는 2개인데 둘다int형 이라는걸 알 수 있게 연습
		System.out.println("result-1 : " + result);
		System.out.printf("%d 더하기 %d는 %d입니다.\n", n1, n2, result);
		result = intSum(1,2); // 3
		System.out.printf("%d + %d = %d\n", n1, n2, result);
		
		for(int i=0; i<100; i++) { //파이썬에서는 곱하기 하면 되지만 자바에서는 for문 써줘야 여러번 쓸 수 있음 !
		hello();
	    }
	}

	public static void hello() {
		System.out.println("안녕하세요!!!");
	}
	
	public static void voidSum(int n1, int n2) { //void는 return하지 않겠다는 뜻 ! 근데 선택이라서 써도되고 안써도 됨 / in put-out put있으면 비void, input만있으면 void
		System.out.printf("%d + %d = %d\n", n1, n2, (n1+n2));
	}
	
	public static int intSum(int n1, int n2) { //int n1, n2 안됨 ! 메소드에서는 적용x
		return n1+n2; //비void는 return 무조건 적어줘야함 !!
	}
	
	public static String print() {
		return 1+1+"";
	}
}
