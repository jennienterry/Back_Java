package sec06.ch04;

public class ForExam {
	public static void main(String[] args) { // 앞에 빨간글자= 예약어 : 이름으로 쓰면 안됨
		//배열 때문에 i는 0부터 시작~!
		for(int i=0; i<10; i++) { //'i=0'부분은 최초 한 번만 실행 !!
			// for(int 초기화할 때; 몇번 반복할지에 대한 기준점; true일 동안은 계속 반복; 증감식)
			// false가 되면 종료됨, 몇 번 반복할 때 씀
			System.out.println("i : " + i); // i++보다 여기 sysout이 먼저 실행됨 !
		    // 
			
			for(;;) { // 무한루프 / ;true;, for(int i=0; i<10;) 이런 경우도 무한 (비정상) 
				System.out.println("안녕");
			}
		}
	}

}
