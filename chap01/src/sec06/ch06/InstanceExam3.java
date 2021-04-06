package sec06.ch06;

// 원시타입과 참조타입의 큰 차이점 비교해보기
public class InstanceExam3 {

	public static void main(String[] args) {
		/*
		 * 참조타입을 사용하는 목적은 메모리를 효율적이고 가볍게 사용되기 때문이다. 리터럴 값을 저장해서 사용하는 거보다 한번 저장한 값의 주소값을
		 * 부르는게 더 가볍다.
		 */
		int mainNum = 10;
		Box box1 = new Box(); /* Box의 주소값이 들어가 있다. 주소값이 가르키는 값이 10인 것이다. */
		box1.num = 10;

		changeNum(mainNum);
		System.out.println("mainNum : " + mainNum);

		changeBoxNum(box1);
		System.out.println("box.num : " + box1.num);

	}

	public static void changeNum(int num) { /* 여기서 num은 mainNum과 같은 변수가 아니다 다른존재임 mainNum의 값을 복사하여 가져오는 것 */
		num = 20;
	}

	public static void changeBoxNum(Box box2) {/* 위와 같이 다른 변수이다.Box의 주소값을 복사하여 가져옴 */
		box2 = new Box(); /* 레퍼런스 변수는 주소값을 리턴할 필요가 없다 */
		box2.num = 20; /* 주소값이 바뀌는게 아니라 주소값 안의 값을 바꾼것(위에서 주소값을 참조하여 그 주소값으로 접근하여) */
	}
}

class Box { /* 멤버필드를 속성이라고도 한다. (사람의 키, 몸무게, 이름... 과 같은 것들) */
	int num;
}