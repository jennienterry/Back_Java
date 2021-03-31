package sec06.ch05;

public class ArrayExam {

	public static void main(String[] args) {
		// 배열 (같은 타입의 변수를 여러개 사용하기 편하기 위해 사용하는 것)
		// 1, 100, 200, 34, 33 ...
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12; // 단독주택, 값 하나만 넣을 수 있음
		n2 = 10;
		n3 = n2 + 4;
		
		int[] intArr = new int[10]; // 10개의 수를 저장할 수 있는 공간이 할당된 것 // 아파트, 한 층마다 한 값이 들어가고 10개의 층이 있음
		intArr[0] = 11; // 배열은 0부터 시작함
		intArr[1] = 12;
		intArr[19] = 13; // n2=10이지만 0부터 시작해서 9까지 나오는 것임
		intArr[3] = intArr[19] + 4; // 19방에는 13값이 있으니까 13+4 = 17
		for(int i = 0; i < 10; i++) {
			intArr[i] = 10;
		}
		
		//byte, short, int, long, boolean, char, float, double -> 원시형, 나머지는 참조형
		//변수 크게 2가지 (원시형Primitive Type/ 참조형 Reference Type : 대문자로 시작)
		String[]strArr = new String[10]; // 여기랑 = 여기 앞 뒤 타입이 똑같아야함
		System.out.println("strArr[1] : " + strArr [1]);
		int len = 5;
		
		int[] intArr2 = new int[len]; // int[]이름 = new int[몇 칸 만들건지 숫자 정수값 넣기]; / 배열은 참조형
		// 방법1 : 이 방법으로 쓰면 그 후에 intArr[0] = 20; 각 값을 다 줘야함 + 그래서 for문으로 한번에 값주는 것
		
		// 원시형은 각 방에 기본값이 0 // 참조형은 각 방에 null이 기본값 // 정수형과 double은 0이 기본값 // boolean은 false
		System.out.println("intArr[1] : " + intArr [1]);
		
		System.out.println("----------------------");
		int[] intArr3 = {10,20,30};// 각 호실 크기가 3칸 ! 값도 미리 넣겠다는 의미
		// 방법2 : 방법1을 한번 쓰고나면 방법2는 쓸 수 없음 
		// 0번방에 10, 1번방에 20, 2번방에 30
		// intArr2[1] = 2000; // 값 넣는 식!
		for(int i=0;i<3; i++) {
			System.out.printf("intArr2[%d] : %d\n",i,intArr2[i]);
		}
		
	}

}
