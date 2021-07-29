package javastudy3;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
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
