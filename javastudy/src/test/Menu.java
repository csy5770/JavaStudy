package test;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> mnName;//메뉴 ArrayList 선언
	private ArrayList<Integer> mnPrice;//가격 ArrayList 선언
	
	void init() { //메뉴,가격 ArrayList 초기화
		this.mnName = new ArrayList<String>();
		this.mnPrice = new ArrayList<Integer>();
	}
	void addName(String name) { //메뉴 ArrayList 추가 메서드
		this.mnName.add(name);
	}
	void addPrice(int price) { //가격 ArrayList 추가 메서드
		this.mnPrice.add(price);
	}
	void showMenu() { //메뉴명, 메뉴가격 출력.
		for(int i=0; i<mnName.size(); i++) {
			System.out.println("메뉴명: "+ mnName.get(i)+", "+"가격: "+ mnPrice.get(i));
		}
		
	}
}
