package sec06.ch04;

public class IfExam {
	public static void main(String[] args) {
		int score = 93;
		
		if (score>=90) { //if문만 있으면 ! 둘 다 실행이 될 수도 있고 안될 수도 있고 경우에 따라 다름
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급 A");
		}

		if (score<90) {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급 B");
			
		}
		System.out.println("끝");
		
	System.out.println("---------------------------------------");
	
	if (score>=90) { //그룹으로 묶은 경우고, else있으면 둘중 하나가 무조건 실행 됨
		System.out.println("score가 90보다 큽니다.");
		System.out.println("등급 A");
	}

    else{ //나머지/ 위에 if가 false면 else 실행하겠다. = else가 있으면 무조건 실행
		System.out.println("score가 90보다 작습니다.");
		System.out.println("등급 B");
		
	}
	System.out.println("끝2");
	}
		
	}
