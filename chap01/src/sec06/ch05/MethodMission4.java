package sec06.ch05;

public class MethodMission4 {
	public static void main(String[] args) {

		//1
		int rNum = getRandomNum(); // 0~9 //값을 비워놨음 !
		System.out.println("rNum : " + rNum);
		
		//2
		rNum = getRandomNum(20); //0~19 //자바에서는 같은이름의 메소드를 여러개 만들 수 있음; 구분은 파라미트가 함
		rNum = getRandomNum(5); //0~4
		
		//3
		rNum = getRandomNum(5,10); //5~10
		System.out.println("rNum : "+ rNum);
		rNum = getRandomNum(10,20); //10~20
	    System.out.println("rNum : "+ rNum);
	}
	
	//1
	public static int getRandomNum() { // 값 비워놨기 때문에 호출할 때도 비워놔야함
		int val = (int) (Math.random() * 10);
		return val; // int형이 들어가야함 !!!
	}
	
	//2
	public static int getRandomNum(int max) {
		return (int) (Math.random() * max);	// max라는 변수를 쓴 것, 숫자를 정해버리면 고정이되니까
	}

	//3
	public static int getRandomNum(int min, int max) {
//		return (int) (Math.random() * (max+min)-1) + min; // 최댓값+최솟값 -1
		return (int) (Math.random() * (max-min)+1) + min; // 최댓값-최솟값 +1 
	}
	}
	

