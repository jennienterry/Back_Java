package sec06.exam01;

public class VariableExample {
	public static void main (String[] args) {
		/* 주석 멀티라인 */
		//싱글라인// = ctrl+/
		//System.out.println(10/0
		// 변수 (값이 변할 수 있다.) / 정적언어 (타입이 굉장히 중요) / 한번 정수형은 영원한 정수형
		int a = 10; // int a; 컴파일 안된다. 값이 없으니까
		// ->변수선언 -> 여기서 system.out하면 에러뜸 a 읽을 수 없음
		System.out.println(a);
		// 빨간줄 = 컴파일 안된다
		a = 10; //변수 초기화 (10:초기값)
		int value = 10; /* 정확하게 정수만 저장할 수 있는 아이
		int변수타입 value변수명 = 오른쪽값을 복사하여 왼쪽에 준다 / 오른쪽 10;은 읽기 */
		int result = value + 10; /*여기 value는 위에서 10 값을 줌, 오른쪽 먼저 실행함 */
		System.out.println(result);
	}
}
