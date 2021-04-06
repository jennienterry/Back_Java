package sec06.ch06;

public class InstanceExam2 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = d1;
		d1.name = "뽀삐";
		d2.name = "돌쇠"; /* 둘다 뽀삐 값에서 돌쇠로 덮어쓰기가 되어 둘다 돌쇠로 출력 */
		
		d1.bark();
		/* 메모리의 특성
		 * Stack영역 / Heap영역
		 * stack : 메모리를 추출할 때 들어갈 때 순서와 나올 때 순서가 다르다. 먼저 들어간게 제일 나중에 나온다. (주소값 저장)
		 * heap : 먼저 들어간 메모리가 가장 먼저 추출한다. (객체의 정보를 저장)
		 * */
	}

}