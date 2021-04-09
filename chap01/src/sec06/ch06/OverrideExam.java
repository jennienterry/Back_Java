package sec06.ch06;

public class OverrideExam {

	public static void main(String[] args) {
		NumBox nb1 = new NumBox (10);
		NumBox nb2 = new NumBox (10);
		
		System.out.println(nb1);
		System.out.println(nb2);
		System.out.println("nb1 == nb2 : " + (nb1 == nb2)); //참조타입의 == 비교는 주소값 비교임 !
		System.out.println("nb1.equlas(nb2) : " + (nb1.equals(nb2))); // .equals했는데 왜 false냐?
		// String을 equals 비교하고 싶을 때는 오버라이딩하면 비교가능
	}

}


class NumBox{
	private int num;
	NumBox(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
	@Override // 부모꺼 그대로 안쓰고 바꿔쓸 수 있다.
	public boolean equals(Object obj) {
//		Object obj2 = new NumBox(10); // 주소값도 가르킬 수 있고, 정수값도 가질 수 있음
		NumBox temp = (NumBox)obj;
		
		return this.getNum() == temp.getNum();
	}
	
}