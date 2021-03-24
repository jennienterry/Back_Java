package sec06.exam01;

/* 실수 (2가지), 형이 다르게 되면 문제가 생긴다. 소수점이 실수 */
public class FloatDoubleExample { //메모리 많이 차지해서 지수값으로 저장, 근사치가 나오지 완벽한 것은 아님
	
	public static void main(String[] args) {
		//float f = (float)10.1; / 빨간 밑줄 '컴파일 에러' = 해석 할 수 x / 인터럴?
		//float f = 10.1f; 형 변환해서 넣어주기
		float f = 10.1f; // 대문자, 소문자 다 가능
		double d = 10.2; // 기본적인 실수 저장가능, 더블타입 숫자에. 들어가면 무조건 더블타입 / double이 더 큼
	}
}


