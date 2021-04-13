package sec06.ch07;
 				 //상속의 의미 extends 아님
public class LGTv implements RemoteControl { // 강제성, 상속받은 메소드 하나만 없어도 빨간줄

	private int volume;
	
	public void welcome() {
		System.out.println("LG Welcome !!");
	}
	
	@Override
	public void volumeUp() {
		volume++;
	}

	@Override
	public void volumeDown() {	
		volume--;
	}

	@Override
	public void chkVolume() {
		System.out.println("volume : " + volume);
	}
		
	

}
