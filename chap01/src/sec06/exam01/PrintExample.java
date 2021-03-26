package sec06.exam01;

public class PrintExample {
	public static void main (String[] args) {
		//console에 찍을 수 있는 아이들
		System.out.println("하하"); //ln =line의 줄임말?
		System.out.println("호호");
		System.out.println("후후");
		System.out.println(); //개행 sysout + ctrl + space 단축키
		System.out.print("하하");
		System.out.print("호호"); //ln없으면 옆으로 찍힘
		System.out.print("후후");
		System.out.println(); //개행 , = 여기 줄은 위에 "후후"에서 엔터한 개념임
		System.out.println(); //개행
		System.out.print("하하\n");
		System.out.print("호호\n");
		System.out.print("후후\n");
		
		//TODO: System.out.printf 나중에 설명
		char bloodType = 'O';
		int age = 9;
		float weight = 30.4f;
		String name ="홍길동"; //변수가 있으면 하드코딩이 아님
		
		//제 이름은 홍길동이며, 나이는 14살이고, 혈액형은 O형이고, 몸무게는 30.4kg입니다.
		System.out.println("제 이름은 홍길동이며, 나이는 14살이고, 혈액형은 O형이고, 몸무게는 30.4kg입니다.");
		//하드코딩 !!! = 변하지 않는것
		System.out.println("제 이름은 " + name + "이며, 나이는 " + age + "살이고, 혈액형은 "	
				+ bloodType + "형 이고, 몸무게는 " + weight + "kg입니다."); //가독성 떨어짐
		System.out.printf("제 이름은 %s이며, 나이는 %03d살이고, 혈액형은 %c형 이고, 몸무게는 %fkg입니다."
				, name, age, bloodType, weight);
		/* %x : 16진수 / %u : unsigned int형으로 부호없는 10진수 / %g : 실수형 자동출력 /
		 * %p : 포인터의 주소 / %c : 하나의 문자로 출력 / %s : 문자열, string /
		 * %d : 정수 / %f : 실수 */
	    // printf = 문장에서 값을 삽입하고 싶을 때, 가독성이 좋음, javascript에서도 사용가능
		// printf에서 "나이는 %5d살이고," 하면 다섯칸 spacebar띄운다 는 의미 / -5d하면 왼쪽정렬
		// 위와 같이 "나이는 %05d살이고," 하면 빈칸을 0으로 채운다는 의미 (0이 네개, 9살이면 마지막 자리에 9가 들어감)
		// 2021-01-10, 2021-12-09 달력할 때 용이함
		// 나이가 9살일 때, %02d 하면 나이가 '09'로 두자리로 뜨게 됨
		// 0.2fkg하면 두자리 정수까지 나옴,  띄우는 갯수에 .점과 실수값도 포함
		// .뒤에 숫자를 넣으면 그 숫자만큼의 자릿수가 나온다. 6이면 .000000까지 여섯자리 나옴
		// 기능없이 그냥 다 찍을때는 %s 해도 됨
		char ch ='c';
		System.out.printf("%d : %c", (int)ch, ch);
		
		
	}
}
