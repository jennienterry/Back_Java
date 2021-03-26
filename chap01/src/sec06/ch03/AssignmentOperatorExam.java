package sec06.ch03;

public class AssignmentOperatorExam {
// p.98 대입연산자
	public static void main(String[] args) {
		int n1 = 0; // 변수가 바뀌려면 대입연산자 =이 있어야 함, = 만나면 오른쪽부터 실행
		n1 = n1 + 5; // ** =이 있으면 무조건 쓰기, 없으면 읽기 **
		System.out.println("n1 : " + n1);
		
		int n2 = n1 + 10; // n2는 15, n1는 5 / 값 바뀐 적이 없기 때문에
		
		System.out.println("n2 : " + n2);
		System.out.println("n1 : " + n1);
		//n1 위에까지 5를 찍고 나서 아래에 2로 변경
        
		n1=2;
		
		System.out.println("-------------------------");
		
		int n4 = 0;
		n2 += 5; // 같은 말 : n2 = n2 + 5;
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		//여기에 마이너스 복합식을 사용하여 4를 빼주세요.
		n3 -= 1; // 같은 말 : n3 = n3 - 1;
		
		System.out.println("n3 : " + n3);
		

	}

}
