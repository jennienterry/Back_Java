package sec06.ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		// h1 나이는 12, 이름은 "홍길동"
		// h2 나이는 20, 이름은 "신사임당"
		
		h1.setName("홍길동");
		h1.setAge(12);
		h2.setName("신사임당");
		h2.setAge(20);
		
		
//		System.out.println("age : " + h1.age);
//		//값 받아와서 찍는거 안됨

		System.out.printf("My name is %s, age is %d.\n", h1.getName(), h1.getAge());
		System.out.printf("My name is %s, age is %d.\n", h2.getName(), h2.getAge());
		
		h1.whoAmI(); //내 이름은 홍길동 나이는 12살입니다.
		h2.whoAmI(); //내 이름은 신사임당 나이는 20살입니다.
	}

}


// enum 상수들의 모임

// private인 것을 다른 클래스에서 사용하고 싶을 때 : 생성자와 메소드로 사용 가능 !! 두 방법 뿐임 *
class Human{
	private int age;
	private String name; //	private final int MAX_AGE = 100; private이랑 final은 상관없음

	
	//생성자는 쓰기 !
	//값 바꾸는 것은 setter로만 가능 !
	//생성자+getter로도 가능하긴 하지만 생성자는 상속처럼 값을 바꿀 수 없기 때문에 생성자로 하는 것은 지양하기
	//* 생성자로 할 경우 클래스 이름이랑 똑같아야함 ! (메소드인데 유일하게 대문자로 시작할 수 있는것)
	//* 생성자는 void, type이 없다. (= return 타입이 없다, return 못한다.)
	//* void나 type이 있으면 생성자가 아닌 것이다.
	//생성자는 생성할 때만 사용하는 것
	
	Human(){
		this("미상",10); //"미상" 이름을 주겠다고 하드코딩 한 것
//		this.name = "미상";
//		this.age = 10;
//		this(10);
	}
	
	Human(int age){
		this("미상",age);
	}
	
	Human(String name){      // 호출 개념 파악하기 !
		this(name,10);
//		this.name = name;
	}
	
	Human(String name, int age){   //(int age, String name) 파라미트 순서를 다르게해도 구분이 가능하기 때문에 다른 생성자임 = 오버로딩 가능
		this.name = name;
		this.age = age;
	}
	//this() : 생성자 호출
	//this. : 멤버필드 혹은 멤버메소드 접근
	//this 없으면 가장 가까운 멤버필드에 접근
	
	
	// 메소드로 할 경우
	// setter는 쓰기 ! // 단축키 : ctrl+3 -> getter -> 엔터
    public void setAge(int age) {
    	this.age = age;
    	return;
    }
    public void setName(String name) {
    	this.name = name;
    }
	
    
	//getter는 읽기 ! / 값 빼내는 것은 메소드 get방법 뿐 ! 
    public int getAge() {
    	return this.age;
    }
    
    public String getName() {
    	return name;
    }	
    	
    public void whoAmI() {
    	System.out.printf("내 이름은 %s 나이는 %d입니다.\n",name,age);
    }
}