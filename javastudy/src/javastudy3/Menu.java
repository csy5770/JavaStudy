package javastudy3;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		this.alName= new ArrayList<String>();
		this.alPrice= new ArrayList<Integer>();
		this.alName.add("갈비만두");
		this.alPrice.add(3000);
		this.addName("갈비찜");
		this.addPrice(5000);
	}
	/* 생성자 - 용도 : 초기화 작업용
	 * 명명법: 이름이 클래스와 같아야함
	 * 반환값 : 반환 값이 없다.(반환할 수 없이, 작업만 실행)
	 * 실행/호출: new 연산자가 실행된 직후, 자동실행.
	 * 
	 */
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() { //alName, alPrice 출력.
		for(int i=0; i<alName.size(); i++) {
			System.out.println("메뉴명: "+ alName.get(i)+", "+"가격: "+ alPrice.get(i));
		}
		
	}
}
