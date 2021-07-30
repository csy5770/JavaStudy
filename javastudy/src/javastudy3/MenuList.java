package javastudy3;

import java.util.Scanner;


public class MenuList {

	public static void main(String[] args) {
		// 메뉴명/가격을 입력하는 루틴
		// 메뉴이름이 ""이 입력되면 루틴(반복문) 종료.
		// 앞서 입력 된 메뉴명/가격 목록들 출력.
		Scanner s = new Scanner(System.in);
		
		Menu menu = new Menu();
		
		
		while(true) {
			System.out.println("메뉴를 입력해주세요");
			String str = s.nextLine();
			if(str.equals("")) {
				System.out.println("메뉴 입력을 종료합니다");
				break;
			}
			System.out.println("가격을 입력해주세요");
			int pr = s.nextInt();
			s.nextLine();
			
			menu.addName(str);
			menu.addPrice(pr);
			System.out.println("메뉴에 추가 되었습니다.");
			System.out.println("");
			
		}
			System.out.println("");
			System.out.println("메뉴표");
			menu.showMenu();
			s.close();

	}

}
