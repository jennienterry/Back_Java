package sec06.ch06;

public class ConstructorExam2 {

	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		//일렉트로 50inch 100Channel  50Volume
	}

}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv2(){
		this("일렉트로",50,100,50); // Tv tv2 = new Tv("Lg", 200, 150, 200); 이것과 같은 효과
	//	this. : 메소드호출 가능 / this() : 무조건 생성자만 사용 가능
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		// super(); vs this
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;

	}

	void volumeUp() {
		this.currentVolume++;
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s, %dinch, %dChannel, %dVolume\n",brand,inch,maxChannel,maxVolume);
	}
	
}
