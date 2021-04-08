package sec06.ch06;
//접근제한자 (= 접근제시어)
public class AccessExam { //public은 같은 파일명에만 줄 수 있다.

	public static void main(String[] args) {
		Access acc = new Access();
		//acc.num = 10;
		acc.printNum();

	}

}

class Access { //같은 패키지 안에 있으니까 접근가능
	private int num;
	 //private : 같은 클래스 안에서만 접근할 수 있도록 하는 접근제한자(=접근제시어)
	void printNum() {//void : 같은 패키지니까 접근가능
		System.out.println("num : " + num);
	}
}


/*P.257	폐쇄적	거의안씀	  실력↑        
종류	  private  default	protected  	 public
class  	O    	 O	       O        	O
패키지	X	     O         O 	        O
상속관계	X	     X	       O	        O
전체    	X      	 X	       X	        O 
변수명			 O	
메소드			 O	
	   캡슐화	           상속관계에서만 	 완전오픈 다 사용가능
       했다고              접근가능
       표현             (같은 패키지) */


/* public으로 열어놓으면 다 쓰니까 private해서 제한하는 것 */ 
/* 싱글톤 객체 하나만 돌려쓰는 것 */
/* 메소드는 stack에 들어가기 때문에 순서가 있음, 내가 쓰는 동안 남이 사용할 수 없음 */
/* 멤버필드는 private // 상수는 public줘도 상관없다. 어차피 값이 안바뀌는 것이니까 */