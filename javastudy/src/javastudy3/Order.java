package javastudy3;

import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	
	Order() {
		this.alMobile = new ArrayList<String>();
		this.alMenu = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alTotal = new ArrayList<Integer>();
	}
	void addMobile(String pNumber) {
		this.alMobile.add(pNumber);
	}
	
	int addOrder(String menuName, int menuPrice, int cnt) {
		this.alMenu.add(menuName);
		this.alCount.add(cnt);
		final int total = menuPrice * cnt;
		this.alTotal.add(total);
		return total; 
		
	}
	int getTotalSum() {
		int sum = 0;
		for(int i =0; i<alTotal.size(); i++) {
			sum = sum + alTotal.get(i);
		}
		return sum;
	}
	
}
