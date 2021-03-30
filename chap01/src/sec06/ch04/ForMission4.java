package sec06.ch04;

public class ForMission4 {
	public static void main(String[] args) {
		int dan = (int) (Math.random() * 8) + 2; // 2~9사이의 랜덤값 추출
		for (int i = 1; i < 10; i++) {
			int result = dan * i;
//			System.out.println(dan + "*" + i + "=" + result);
			System.out.printf("%d * %d = %d\n", dan, i, result);
		}
		System.out.println();
		
		for(int i=6; i<15; i++) { //9번 돌거니까 14까지!			
			int result = dan*(i-5); //i값은 6 그대로임! 그래서 식으로 만들어줘야함 
			//int j = i-5;
			System.out.printf("%d * %d = %d\n", dan, i-5, result); //= dan, j, i-j
			//객체 지향에서 역할이 중요 !
		}
	}
}

// 콘솔 (dan=2)
// 2*1=2
// 2*2=4
// 2*3=6
// ...
// 2*9=18

// 콘솔 (dan=4)
// 4*1=4
// 4*2=8
// 4*3=12
// ...
// 4*9=36
