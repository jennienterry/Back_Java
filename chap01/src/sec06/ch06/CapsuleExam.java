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

// private인 것을 다른 클래스에서 사용하고 싶을 때 : 생성자와 메소드로 사용 가능
class Human{
	private int age;
	private String name;
	
	//생성자로 할 경우 (클래스 이름이랑 똑같은 것이 생성자)
	//생성자는 void, type이 없다. (= return할 수 없다.)
	//void나 type이 있으면 생성자가 아닌것이다.
	Human(){
		this("미상",10);
//		this.name = "미상";
//		this.age = 10;
//		this(10);
	}
	
	Human(int age){
		this("미상",age);
	}
	
	Human(String name){     
		this(name,10);
//		this.name = name;
	}
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//메소드로 할 경우
	// setter // 단축키 : ctrl+3 -> getter -> 엔터
    public void setAge(int age) {
    	this.age = age;
    	return;
    }
    public void setName(String name) {
    	this.name = name;
    }
	
    
	//getter : 값 빼내는 것은 메소드get방법 뿐 !
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