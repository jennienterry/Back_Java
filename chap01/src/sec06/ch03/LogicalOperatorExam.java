package sec06.ch03;

public class LogicalOperatorExam {
	
	public static void main(String[] args) {
		// &&(and), ||(or), !(not)
		
		boolean res1 = (1<7) && true && false; // &&연산자는 다 true여야 true가 됨, false 하나라도 있으면 false임
		System.out.println("res1 : " + res1); // = false
		// true, false 자리에는 값이 들어감 = 비교대상 있다는 이야기
		// 연산 중에 false가능성이 높아 보이는거를 맨 앞에다가 배치 (퍼포먼스상 유리=튜닝)
		// = &&일 때, 앞에 false면 뒤에거 볼 필요도 없이 false임 (비교x), 아니라면 비교ㅇ
		
		boolean res2 = (10>2) || false || true; // ||는 다 false인데 하나만 true여도 true
		System.out.println("res2 : " + res2); // = true, !res2하면 false가 나옴
		// 이 때는 반대로 true가능성이 높아 보이는거를 맨 앞에 배치하겠지?
		// = ||일 때, 앞에 true면 뒤에거 볼 필요도 없이 true임 (비교x), 아니라면 비교ㅇ
		int n =2;
		boolean res = true || (1<n++) || false; // || 연산자의 경우 앞이 true 값이면 뒤는 연산도 안함 ㅡㅡ;
		System.out.println("n : " + n);
				
	
	}

}
