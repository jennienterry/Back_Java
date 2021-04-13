package sec06.ch07;
/* 인터페이스
 * 1. 메소드 기준으로 선언부만 가질 수 있음 
 * 2. 변수개념x 상수로만 저장 가능
 * 3. public 자동생성 (무조건 public)
 * ex) 나라에서 돼지코 만들라고 규격만 알려줬지 어떻게 하라고는 안알려줌.. 그런 느낌.. 
 */

public interface RemoteControl {
		public final static int AGE = 10; // 상수 선언하면 public final static 다 붙음 (생략하면 default일텐데 무조건 public) 
		
		public abstract void volumeUp(); //다 생략해도 기본으로 public abstract가 붙어있음
		abstract void volumeDown();
		void chkVolume(); //static은 안됨

}







/* 접근제어자 (접근제한자)
 * private (같은 클래스만)
 * default (아무것도 안씀, 같은 package안이면 가능)
 * protected 
 * public (전부 다)
 */