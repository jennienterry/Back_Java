package sec06.ch04;

public class SwitchMission3 {
	public static void main (String[]args) {
		// Math.random() 메소드를 이용하여 1~12 범위값만 나오게 처리
		int season = (int)(Math.random() * 12) + 1;
		//(int)(Math.random() * X) + Y; 최솟값이 Y이고,  X + Y - 1이 최댓값
		System.out.println("season : " + season);
		
		switch(season){
		 case 3: 
		 case 4:
		 case 5:
			System.out.println("봄");
		  break;
		 case 6:
		 case 7:
		 case 8:
		    System.out.println("여름");
		  break;
		 case 9:
		 case 10:
		 case 11:
		 System.out.println("가을");
		 break;
		 case 12: // =default:
		 case 1:
		 case 2:
		 System.out.println("겨울");
		 break;
		}
	}

}

//switch로 해결하기, season 값이
//3~5값이면 "봄"
//6~8값이면 "여름"
//9~11값이면 "가을"
//12,1,2 값이면 "겨울"이 콘솔에 찍히도록 처리