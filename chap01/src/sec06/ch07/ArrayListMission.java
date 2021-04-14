package sec06.ch07;

public class ArrayListMission {
	public static void main(String[]args) {
		MyList list = new MyArrayList();
		//MyList는 인터페이스, 객체 만들 수 없다. MyArrayList 주소값을 받아서 객체생성이 가능하게 됨
		
		list.add(10);
		list.add(20);
//		list.add(30);
		list.add(40);
		list.add(50);	
//		list.add(80);
		
		list.add(2,30);
		
		int delVal = list.remove(1);
		System.out.println("delVal : " + delVal); //20
		
//		int val = list.remove(); //list에 remove 메소드가 있어야(알아야) 호출 가능해서 메소드를 만들어주는 것이 먼저임
//		System.out.println("val : " + val);
		
		for(int i=0; i<list.size();i++) {
			System.out.printf("%d : %d\n",i,list.get(i));
	}

}
}
