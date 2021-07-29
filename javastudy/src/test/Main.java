package test;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		menu.init();//이 클래스를 실행할 때 이전 입력 값을 초기화 하는 Menu 클래스의 메서드.
		
		while(true) {
			System.out.println("메뉴를 입력해주세요");
			String str = s.nextLine();//스캐너를 통해 입력하는 String 데이터
			if(str.equals("")) {
				System.out.println("메뉴 입력을 종료합니다");
				break;
			}
			System.out.println("가격을 입력해주세요");
			int pr = s.nextInt(); //스캐너를 통해 입력하는 int 데이터
			s.nextLine(); //가격배열에 들어갈 int 데이터 입력 후 버퍼 방지 공백 입력 작업.
			
			menu.addName(str);//스캐너를 통해 입력하는 String 데이터(메뉴에)
			menu.addPrice(pr);//스캐너를 통해 입력하는 int 데이터(가격에)
			System.out.println("메뉴에 추가 되었습니다.");
			System.out.println("");
			
		}
			System.out.println("");
			System.out.println("메뉴표");
			menu.showMenu();
			s.close();

	}

}
