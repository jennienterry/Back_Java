package sec06.ch06;
// 다향성
public class PolymorExam {
// 어느 객체의 주소값이었는지 잘 파악하면 된다 !
	public static void main(String[] args) {
		Animal ani_1 = new Cat (); // = 부모타입의 변수는 자식객체를 가리킬 수 있다. (= 자식객체의 주소값을 담을 수 있다.)
                                           // 자동형변환처럼 !
		//Cat cat1 = new Animal(); // = 자식타입의 변수는 부모객체를 가리킬 수 없다. (= 부모객체의 주소값을 담을 수 없다.)
		
		Cat cat = (Cat)ani_1; // cat에 ani_1의 주소값을 담을 수는 있음 !
//     = Cat cat = new Cat();    컴파일러가 걱정해서 빨간줄 치는거니까 (Cat)이라고 강제형변환 시키면 됨
							  // 지금 ani_1는 Cat주소값을 담고 있는 애를 가르키기 때문에 = cat이 될 수 있다.
		Animal ani_2 = cat;
		
//		Cat cat1 = (Cat)new Animal("",0); // 부모 주소값은 자식타입의 변수에게 절대 줄 수 없음 ! 강제형변환도 될 수 없음 ! 에러남
		ani_1.howling(); //주소값이 Cat으로 가있기 때문에 Cat에게 있는 howling이 호출 되는 것임
// 안됨-> ani_1.lick(); // Animal(부모)은 lick 을 모르기 때문에 lick을 호출할 수 없음 = 타입은 아는 메소드만 호출할 수 있음 !
		              // = 주소값은 Cat을 가르키지만 사리 Animal 타입이고, Animal타입은 howling이라는 메소드밖에 모름
		 			  // 자식이 알고있는 범위가 더 넓음 = 호출할 수 있는 범위가 다름
		cat.howling(); //Cat 주소값에 Cat 타입이 알고 있는 메소드 = howling, lick
		cat.lick();
		
		System.out.println("끝!");

	}

}

/* 다향성이 어려운 이유 : 멤버필드 때문
멤버필드는 무조건 은닉화(private, 그래서 다향성 몰라도 됨)

1. 부모타입의 변수는 자식객체를 가리킬 수 있다. (= 자식객체의 주소값을 담을 수 있다.)
2. 자식타입의 변수는 부모객체를 가리킬 수 없다. (= 부모객체의 주소값을 담을 수 없다.)
 + 자신의 타입의 변수는 자신의 객체를 가리킬 수 있다.
3. 타입은 아는 메소드만 호출할 수 있다.
   호출이 되었다면 기준은 객체이다. */

