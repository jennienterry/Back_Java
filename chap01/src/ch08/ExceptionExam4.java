package ch08;

import java.sql.*;

public class ExceptionExam4 {
	public static void main(String[] args) {
		/* 싱글톤 프로그램 안에서 객체 1개만 만들어지도록 유도
		 * 2개 이상 만들 수 없도록 한다.
		 * 직접 구현하면 안된다. 
		1. 객체화한다.
		2. 한번만 객체화가 되도록 해야한다.
		*/
		
//		DbUtils du = new DbUtils(); //기본생성자에 private 걸어주면! 외부에서 이거 생성 못한다.
		DbUtils du = DbUtils.getInstance();
		DbUtils du2 = DbUtils.getInstance();
		
		System.out.println(du);
		System.out.println(du2);
		System.out.println(du==du2);
	}

}

class DbUtils {
	private DbUtils(){}
	private static DbUtils dbutils; // = new DbUtils(); 붙인 거랑 같음 // static이 있어야 여기서도 아래에서도 사용가능, 근데 private이니까 사용불가능, 
	
	public static DbUtils getInstance() { // 객체 생성못하나? 왜 static 붙이지?
		if(dbutils == null) {
			dbutils = new DbUtils();
		}
		return dbutils;
	}
	
	Connection getCon(){ //  throws SQLException 
		
		Connection con = null; // 지역변수는 null이라도 넣어줘야 빨간줄 사라진다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // ------?
//								jdbc:mysql://ip주소:포트번호/데이터베이스명		
			final String URL = "jdbc:mysql://localhost:3308/java";
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD); //static메소드 (객체화 안해도 사용가능/ 클래스명.메소드)/ try로 감싸줘야함
			System.out.println("접속성공 !");
		} catch (Exception e) { // Exception하면 다 예외처리해줌
			e.printStackTrace();
			System.out.println("접속실패 !");
			}
//		} catch (ClassNotFoundException 3) 이렇게 하려면 SQLException으로 따로 예외 주기
		
		return con;
	}
}