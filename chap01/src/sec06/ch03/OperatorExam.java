package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		//산술연산자
		 int n1 = 10;
		 int n2 = 3;
		 System.out.println(n1+n2);
		 System.out.println(n1-n2);
		 System.out.println(n1/n2); //int나누기 int는 int임, 실수표현 못함
		 System.out.println((float)n1/n2); /* 실수표현되는 타입으로 바꿔주면 되는데, 왜 한군데만 float을
		 줘도 되는지? float이 더 커서 없는 곳에도 float이 적용이 되는 것 */
		 // byte 크기랑은 다르게 뭐가 우선인지에 따라 달라지는 것
		 float result = (float)n1/n2;
		 System.out.println("result : " + result);
		 System.out.println(n1*n2);
		
		 System.out.println("------------"); //이항연산자
		 int result2=3+4+5*6; //5*6 먼저 계산
		 //곱하기,나누기가 우선순위!기 때문에 37이 나옴, 우선순위 높이고 싶으면 ( )괄호하기
		 System.out.println("result2 : " + result2);
		 
		 int mod = 10%3;
		 System.out.println("mod : " + mod); // %는 나머지를 구하는 것
		 int odd = 3%2; // 홀수 구하기 : 모두 1 = 1나오면 홀수
		 int even = 4%2; // 짝수 구하기 : 모두 0 = 0나오면 짝수
		 System.out.println("odd : " + odd);
		 System.out.println("even : " + even);
		 
		 System.out.println("------------"); // 단항연산자
		 int n3=-2; // = int n3 = 2* -1;
		 System.out.println("n3 : " + (-n3)); // -와 - 하면 +니까 그냥 2

             }
}
