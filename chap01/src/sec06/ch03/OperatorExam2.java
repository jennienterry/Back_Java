package sec06.ch03;

public class OperatorExam2 {
	public static void main(String[] args) { // 증감연산자
		int n1 = 10;
		System.out.println("n1 : " + n1 + 1); //n1++은 n자체가 값이 변하는거고 이거는 그냥 10에다가 1더하는 것
		System.out.println("n1 : " + n1); //10
		n1++; // : n1 = n1 + 1;	//11
		n1++; //12
		System.out.println("n1 : " + n1); //12
		++n1; // 13
		System.out.println("n1 : " + n1); //13
		--n1; //12
		System.out.println("n1 : " + n1); //12
		n1--; //12
		System.out.println("n1 : " + n1); //11
		System.out.println(n1++); //11 
		System.out.println("-------------------"); 
		
		int n2 = 10;
		int result = 10+ (++n2); //++가 앞에 있으면 1을 먼저 올린다, 11이니까 / 앞에붙이면 21
		System.out.println("n2 result : " + result);
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		int result2 = 10+(n3++);// ++가 뒤에 있으면 n3인 10을 먼저 쓰고 올리니까 실제는 결국10/ 뒤에붙이면 20
		System.out.println("n3 result : " + result2);
		System.out.println("n3 : " + n3);
		
		
		System.out.println("-------------------");
		// 논리부정 연산자 (!)
		boolean result3 = !(10>2); //! 나오는 만큼 반대 반대 반대 의미로 생각하면 됨
		System.out.println("result3 : " + !result3); //! 값을 뒤집는다의 의미로 생각하기 트루면 폴스, 폴스면 트루
		
       }
}