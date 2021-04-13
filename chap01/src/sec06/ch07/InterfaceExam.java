package sec06.ch07;

public class InterfaceExam {
// 클래스명 : 명사 / 메소드 : 명사포함 동사 / interface : 보통 형용사
	public static void main(String[] args) {
		RemoteControl rc1 = new LGTv();
		RemoteControl rc2 = new SamsungTv();
		//RemoteControl은 LGTv와 SamsungTv 둘다에게 부모임 (=주소값 받은 경우)
		
		rc1.volumeUp(); //RemoteControl이 아는 메소드 한해서 호출가능
		rc2.volumeUp(); //얘는 소리를 올려줌 
		
		rc1.chkVolume(); // 얘는 출력만 ! 
		rc2.chkVolume();
		
//		LGTv tv1 = new LGTv();
//		RemoteControl rc = tv1;
////		rc.welcome(); remotecontrol은 welcome 메소드를 모르니까 호출할 수 없음
//		rc.volumeUp();
//		tv1.volumeUp();
//		rc.volumeDown();
//		rc.chkVolume();
		
	}

}



/*             <추상클래스>               VS              <인터페이스>
 *             객체화 불가능                              객체화 분가능
 *             부모타입 역할                              부모타입 역할
 *  자식한테 추상 메소드 오버라이딩 강제성 부여          자식한테 추상 메소드 오버라이딩 강제성 부여
 *   
 *              다중 상속 x                              다중 상속 o 
 * (내용이 존재해서 다른지시를 여러개 받게되니까 복잡)       (명령어만 있고 내용은 없어서 가능)
 *           변수 가질 수 있음                           변수 가질 수 없음 
 *           상수 가질 수 있음                          상수만 가질 수 있음
 *     구현부 있는 메소드를 가질 수 있음               구현부 있는 메소드를 가질 수 없음 (선언부만 존재)
 *         추상메소드 가질 수 있음                      추상메소드만 가질 수 있음
 */