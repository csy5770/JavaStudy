package javastudy3;

import java.util.Scanner;

public class MenuList2 {

	public static void main(String[] args) {
		// m:메뉴 관리
		// o:주문받기
		// s:실적보기
		// x:프로그램 종료.
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		
		while (true) {
			// s.nextLine() 사용자한테 공백을 포함한 문자열을 입력받는 메서드(함수)
			String str = s.nextLine();
			if(str.equals("x")|| str.equals("X")) {
				System.out.println("종료");
				s.close();
				break; //break는 반복문 종료
				//main()함수에서의 return 은 프로그램 종료 
			}
			else if(str.equals("m")|| str.equals("M")) {
				System.out.println("메뉴");
			}
			else if(str.equals("o")|| str.equals("O")) {
				System.out.println("주문");
			}
			else if(str.equals("s")|| str.equals("S")) {
				System.out.println("매출");
			}
			else {
				System.out.println("잘못 된 입력");
			}
		
		}
	}

}
