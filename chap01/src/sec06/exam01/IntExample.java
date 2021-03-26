package sec06.exam01;
/*
 * 정수 모두 정리 (4가지)
 */
public class IntExample {
	public static void main(String[] args){
		char c = 'a'; //아스키코드에 의해 96이 들어가있음, ' ' 안에 문자 하나만 가능, 실제 저장은 정수값으로! 
		
		String strValue="A";
		char var = (char)Integer.parseInt(strValue);
		
		boolean bb = true;
		
		//byte byteValue=10;
		//float floatValue = 2.5f;
		//double doubleValue = 2.5;
		//char+char = int
		//byte+byte = int가 됨, byte는 +더하기 ㄴㄴ
		//int aac = (int)bb;
		//short aa = c;
		//System.out.println("Z:"+aa);
		//char ggggg = ''; char은 빈칸 불가능, 뭐라도 써야함
		byte b = 10;   // -128~127
		short s = 20;  // -32768~32767
		int i = 30;    // int랑 long 사용, 나머지는 작아서 잘 안씀 / 숫자를 저장할 수 있는 크기가 다른 것
		long l = 40;
		//long l = 4_000_000; //40,000나타내고 싶을때 콤마대신 _ 언더바쓰기
		//자동형변환, java는 피 연산자가 2개 필요함. 같냐 다르다 할 때. 비교대상 2개 = 이 때 무조건 형이 같아야함
		s = b; //  type을 변형시킴 = 형 변환 / 이 경우 자동 형변환 ! s가 더 크니까
	    s = (short)i; // 수동으로 형 변환을 해주어야 함, i가 s가 되려면 넘치니까 오류라서 밑줄 나옴
	    //조심해서 써야함, 문제가 될 경우에는 안 쓰거나 강제 형변환 해주어야함
    }
}