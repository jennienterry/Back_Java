package sec06.exam01;

//원시타입 vs 참조타입(Reference Type)
public class PrimitiveTypeExample {
	public static void main(String[] args){
		//총 8개
		
		//byte, short, int, long (정수, 숫자만)
		//float, double (실수, 숫자만)
		//byte (1byte) < short (2) < int (4) < long (8) < float (4) < double (8)
		// ---> 방향이면 자동형변환ㅇ, <--- 방향이면 형변환 해줘야함
		short sss1 = 10;
		long 1112 = 10;
		//short result = 1112 + sss1; 결과가 20으로 long인데 short에 넣으려고 하니까 에러
		long result = 1112 + (long)sss1;
		
		byte var1 = 0; //128이면 바로 빨간줄, byte는 ~127까지 담기때문 = MAX값이 127
		short var2 = -129; //-32768~32767, +이면 돌아서 -값으로 나오고, -이면 돌아서 +값으로 나옴 = underflow, overflow
		//byte에서 129값을 쓰려고하면 2overflow 되었으니까 한바퀴 돌아서 -127 이 표현됨...
		var1 = (byte)var2; //MAX값을 확인한 후에 넣기
		System.out.println("var1 : " + var1 ); //"string" = 문자열, console에 그냥 문자로 뜸
		// 여기서도 더하기를 우선으로 하고 싶으면 괄호 하면 됨
		float var3=10.123f;
		int var4 = (int)var3;
		System.out.println("var4 : " + var4);
		
		//char (문자형) 
		//boolean  이 8개 빼고 나머지는 다 참조타입 / 원시타입은 전부 소문자로 시작
		//원시타입은 리터럴값을 저장한다.
	}

}
