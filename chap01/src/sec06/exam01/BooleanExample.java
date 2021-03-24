package sec06.exam01;
 /* 논리 */
public class BooleanExample {
	public static void main(String[]args) {
		boolean result = 10 > 2;
		System.out.println(result);
		
		result = true;
		System.out.println(result);
		
		result = false; //여기까지는 쓰기 밑에는 읽기
		System.out.println(result);
		
		System.out.println(result); //Boolean에서는 if문 나오면 true 또는 false 뿐임
		
		if(10>2) { // 이 결과 값이 Boolean 이다 라고 알면 됨 / 피연산자가 두개니까
		}
	}

}