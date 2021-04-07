package sec06.ch06;

public class ConstructorExam {
	// 생성자
	// 객체지향 언어는 모든 생성자를 사용한다.
	// 생성자는 객체가 만들어질 떄 무조건 호출을 해야한다.

	public static void main(String[] args) {

		Tv tv1 = new Tv(); // Tv();만 기본 생성자
		tv1.currentVolume++;
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 100;
		tv1.displayState();
		//Samsung 100inch 100Channel 100Volume

		Tv tv2 = new Tv("Lg", 200, 150, 200); // 오버라이트 생성자
		tv2.displayState();
		//LG 200inch 150Channel 200Volume
		tv2.currentVolume++;
		// 0
		tv1.volumeUp();// 1
		tv1.volumeUp();// 2
		tv1.volumeUp();// 3
		tv1.displayVolume(); // 현재 볼륨 :3
		tv2.displayVolume(); // tv2는 볼륨을 올린 적 없음, tv1과 별개이기 떄문에 값이 올라가지 않음
	}

}

class Tv {
	String brand; // null
	int inch; //0
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	// 생성자 vs 메소드 : 구분기준
	// 기본 생성자
	// * 이름은 클래스명이랑 같다.
	// * 리턴타입이 없다. void나 int 적어주면 안된다 ! 적는순간 메소드가 됨
	// 객체 생성할 때만 사용할 수 있다. 그 이후에는 사용할 수 없다.
	// 생성자가 하나도 없을 때만 컴파일러가 자동으로 생성자를 만들어 넣어 준다.
	
	Tv(){} //기본 생성자가 2개니까 이것도 2개 필요, 표현방법이 다른 것
	
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		System.out.println("Tv 기본 생성자");
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;

	}

	void volumeUp() { // 메소드 안에서 만들어진 애들은 죽음, 의미x
		int currentVolume = 0; // 이렇게 있으면 scope가 다르기 때문에 위의 main에 영향을 미치지 않고 죽어버림 , 지역변수
		this.currentVolume++; // 지역변수는 잠깐 저장하는 것 / 전역변수는 값이 유지되는 것 //전역변수
		// this는 나 자신의 주소값을 가짐 
		// this.가 붙으면 가장 가까운 currentVolume에 접근한다.
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s, %dinch, %dChannel, %dVolume\n",brand,inch,maxChannel,maxVolume);
	}

}