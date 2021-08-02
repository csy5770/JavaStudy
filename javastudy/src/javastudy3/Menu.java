package javastudy3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		this.alName= new ArrayList<String>();
		this.alPrice= new ArrayList<Integer>();
		
		
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
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	void showMenu() { //alName, alPrice 출력.
		for(int i=0; i<alName.size(); i++) {
			System.out.println("메뉴명: "+ alName.get(i)+", "+"가격: "+ alPrice.get(i));
		}	
	}
	void save() { //ArrayList alName과 alPrice를 menu.txt에 저장.
		
	}
	void load() {//menu.txt를 읽어서 ArrayList에 로드.
		File file=new File("d:/menu.txt");
		if(file.exists()) {
			BufferedReader inFile = null;
			try {
				inFile = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String line;
			try {
				line = inFile.readLine();
				while(line!=null) {
					//
					String[] parts=line.split(",");
					addName(parts[0]);
					addPrice(parts[1]);
					line=inFile.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
