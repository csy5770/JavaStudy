package javastudy;

import java.util.Scanner;

public class JavaStudy10 {

	public static void main(String[] args) {
		/*
		 * 1. 사용자 입력을 받음
		 * 2. 입력 값이 'x'면 "프로그램 종료"를 출력하고 프로그램 종료.
		 * 3. 입력 값 
		 * 		(a) 'm'이면 "메뉴리스트"를 출력
		 * 		(b) 'o'면 "주문"을 출력
		 * 		(c) 's'면 "매출현황" 출력.
		 * 4. 1.로 돌아간다.
		 */
		Scanner s = new Scanner(System.in);
		//Scanner s라는 객체 메서드를 생성.
		String str = s.nextLine();
		// s.nextLine() 사용자한테 공백을 포함한 문자열을 입력받는 메서드(함수)
		do {
			str = s.nextLine();
			if(str.equals("m")|| str.equals("M")) {
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
			
		} while(!str.equals("x")||!str.equals("X"));
		System.out.println("종료");
		s.close();
	}

}

