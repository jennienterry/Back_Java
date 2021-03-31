package sec06.ch05;

public class ArrayMission {
	public static void main(String[]args) {
		//정수형 배열 생성 (10칸짜리) = int정수형, []배열, 10열칸
		//모든 방에 정수값 20을 세팅
		
		int[] intArr = new int[10]; //모든 방에 0이 들어가있는 상태임! 정수형 기본 0 // new 들어가면 객체다!
		// 참조형들은 뒤에.찍으면 기능이 나옴 ex)intArr. / 나머지는 빨간줄 int.
		
		for(int i=0; i<intArr.length; i++) { // 값 넣는거 / 방 10개니까 10까지 // * intArr.length 사용하기 *
			intArr[i] = 20;
		}
		
		for(int i=0; i<10; i++) { // 값 출력하는거
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
		
		
	}

}
