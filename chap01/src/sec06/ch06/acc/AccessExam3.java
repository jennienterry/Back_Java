package sec06.ch06.acc;

import sec06.ch07.RemoteControl;

//import sec06.ch06.Access; //접근이 안된다.

public class AccessExam3 {

	public static void main(String[] args) {
//		Access acc = new Access(); // 접근이 안된다. default라서
		
		System.out.println(RemoteControl.AGE); // 다른package인데 가능하다는 것은 dafault가 아니가 public이라는 의미
		
//		RemoteControl.AGE = 11; //상수만 가능하기 때문에 값 변경 불가능 !

	}

}
