package sec06.ch04;

public class IfExam2 {
	public static void main(String[] args) {
		int score = 81; // 69,70,71,79,80,81,89,90,91 로 체크해보기
		
		if (score>=90) { //그룹으로 묶은 상태여서 이 중에 하나는 무조건 실행, else가 있기 때문! // 90 ~
			System.out.println("등급 A"); //그룹으로 묶지 않으면 바로 실행이니까 다 출력이 됨
		} else if (score>=80) { // 80 ~ 89
			System.out.println("등급 B");
		} else if(score>=70) { // 70 ~ 79
	    	System.out.println("등급 C");
	    } else //else는 옵션이라 없어도 되긴 함 // ~ 69
	        {System.out.println("등급 D");	
	    }    	
		System.out.println("끝");
}
	}


//그룹으로 묶는다는게 if, else if, else 같이 있는거/ if문만 있으면 그룹x