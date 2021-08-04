package javastudy3;

import java.io.IOException;

import java.util.Scanner;

public class MenuList2 {
	
	

	public static void main(String[] args) throws IOException {
		// m:메뉴 관리
		// o:주문받기
		// s:실적보기
		// x:프로그램 종료.
		Scanner scn=new Scanner(System.in);
		Menu menu = new Menu();
		menu.load();
		
		while (true) {
			// s.nextLine() 사용자한테 공백을 포함한 문자열을 입력받는 메서드(함수)
			String str = scn.nextLine(); //m
			if(str.equals("x")|| str.equals("X")) {
				System.out.println("종료");
				
				break; //break는 반복문 종료
				//main()함수에서의 return 은 프로그램 종료 
			}
			else if(str.equals("m")|| str.equals("M")) {
				Scanner s1=new Scanner(System.in);
				System.out.println("메뉴관리");
				menu.showMenu();
				System.out.println("메뉴 작업.(c:추가,r:목록보기,u:수정,d:삭제,q:종료)");
				while (true) {
					String st = s1.nextLine();
					if(st.equals("q")|| st.equals("Q")) {
						System.out.println("CRUD 종료");
						
						break;
					}
					else if(st.equals("c")|| st.equals("C")) {
//						System.out.println("추가할 메뉴 입력 ");
//						String mn = s.nextLine();
//						System.out.println("가격 입력");
//						int pr = s.nextInt();
//						if(pr<0) {
//							System.out.println("가격이 유효하지 않음.");
//						}
//						s.nextLine();
//						menu.addName(mn);
//						menu.addPrice(pr);
//						System.out.println("메뉴에 추가 되었습니다.");
//						System.out.println("");
						menu.appendMenu();
					}
					else if(st.equals("r")|| st.equals("R")) {
//						System.out.println("목록보기");
						menu.showMenu();
//						System.out.println("");
					}
					else if(st.equals("u")|| st.equals("U")) {
//						System.out.println("수정할 메뉴번호");
//						int id = s.nextInt();//메뉴번호 스캐너
//						s.nextLine();
//						System.out.println("이 이름으로 변경합니다 ");
//						String nm = s.nextLine(); //변경할 메뉴 이름 스캐너
//						System.out.println("이 가격으로 변경합니다");
//						int npr = s.nextInt(); //변경할 가격 스캐너
//						s.nextLine();
						menu.changeMenu();
//						System.out.println("메뉴 변경 완료");
//						System.out.println("");
					}
					else if(st.equals("d")|| st.equals("D")) {
//						System.out.println("삭제할 메뉴번호");
//						int id = s.nextInt();//삭제할 메뉴번호 스캐너
//						s.nextLine();
						menu.deleteMenu();
//						System.out.println("삭제 했습니다.");
//						System.out.println("");
					}
					else {
						System.out.println("잘못된 입력");
						System.out.println("");
					}
					System.out.println("메뉴 작업.(c:추가,r:목록보기,u:수정,d:삭제)");
				}//안쪽 while
				
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
		
		}//위 while
		menu.save();
		
	}
}
