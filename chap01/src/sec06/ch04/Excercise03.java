package sec06.ch04;

public class Excercise03 {
	public static void main(String[] args) {
		//for문 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구해라
		
		int sum =0;
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				sum = sum + i;	
			}
		}//end of for
		System.out.println(sum);

}//m
}//c