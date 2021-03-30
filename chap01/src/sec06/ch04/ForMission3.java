package sec06.ch04;

public class ForMission3 {

	public static void main(String[] args) {
		int star = (int)(Math.random() * 6) + 5;
	    System.out.println("star : " + star);
	    
	    for (int i=0; i<star; i++) { // = i=1; i<=star
	    	System.out.print("*");
	    }
	  

	}

}


// 5~10사이 랜덤값 나오도록
// 만약 star 값이 5였다면 콘솔에 "*****"
// 만약 star 값이 8였다면 콘솔에 "********"