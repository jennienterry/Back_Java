package sec06.ch06.blackjack;

public class Card extends Object {
	private String pattern; //instance변수
	private String symbol;

	//Overloading
	//생성자 : 리턴타입 없다, class명이랑 메소드명이랑 같다 / void 적으면 메소드임
	public Card(String pattern, String symbol) {
		this.pattern = pattern;
		this.symbol = symbol;
	}
	
	// instance 변수가 private이니까 메소드나 생성자 사용해주기 !
	public String getPattern (){
		return this.pattern;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	@Override
	public String toString() {
		return this.pattern + "(" + this.symbol + ")";
	}
	// toString(주소값)을 String으로 return하겠다는 의미
	// = return String.format("%s (%s)",pattern,symbol); 
	
	
}
