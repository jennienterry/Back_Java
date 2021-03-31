package sec06.ch04;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : "); //console에 (숫자만 적기, 문자쓰면 에러)
		int age = scan.nextInt(); // 기다렸다가 console에 값이 찍히자마자 여기로 
		
		System.out.printf("당신의 나이는 %d살 입니다. \n",age );
		System.out.println("끝!");

	}

}
