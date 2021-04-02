package sec06.ch05;

public class MethodExam {
 // void: 리턴타입 + main: 메소드이름 + (String[]args): 매개변수(파라미터) 변수!! + {}: 범위가 어디까지인지 = 메소드
	public static void main(String[] args) { // 메인 메소드, ()소괄호 있으면 메소드 의심해보기
		int aaa = 10;
		int result = sum(aaa,20); //메소드를 호출한 것, 사용법-> 메소드명(값,값) 값만 보내기! //int = 10 은 정의임 !
		System.out.println("sum-result : " + result);
		
		result = minus(20,10);
		System.out.println("minus-result : " + result);
	}
	//메소드 안에 {} 메소드 ㄴㄴ !!! 다 형제관계임 나란히
	public static int sum(int n1, int n2) { // public ~ int n2) 까지를 선언부 라고 함, {}안은 구현부
		//return하는 값의 타입 !! 위에 int sum~ 할 때 int같이 타입을 꼭 적어주기
		return n1 + n2; // 호출한 곳으로 돌아가겠다는 뜻, 숫자를 다 가지고 이동함 !! / 그때 그때 들어왔는 값에 따라 일을 함
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
}

//void인 메소드, void가 아닌 메소드