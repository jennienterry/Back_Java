package sec06.ch06;

public class InstanceExam5 {
//비void = 어떠한 값도 주지 않겠다, void = 값을 주겠다
	public static void main(String[] args) {
		Car[] carArr = new Car[5]; //Car car1 = new Car();과는 다름 (이거는 car type)
		//carArr의 각 칸은 car type이고, null이 들어가있음 (car array타입) / null = 객체를 사용할 수 없다.
		
		carArr[0] = new Car();
		carArr[0].name = "그랜저";
		
		System.out.println(carArr); /* 주소값 */
		System.out.println(carArr[0]); /* 주소값안에는 아직 값이 없어서 null이다 */
	}

}
