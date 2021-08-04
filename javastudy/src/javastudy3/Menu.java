package javastudy3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
		if(price == 0 || price<0) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	
	void appendMenu() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("추가할 메뉴 입력 ");
		String mn = s1.nextLine();
		System.out.println("가격 입력");
		int pr = s1.nextInt();
		if(pr<0) {
			System.out.println("가격이 유효하지 않음.");
		}
		this.alName.add(mn);
		this.alPrice.add(pr);
		System.out.println("메뉴에 추가 되었습니다.");
		System.out.println("");
	}
	
	void changeMenu() {//set, arraylist 활용
		Scanner s2 = new Scanner(System.in);
		System.out.println("수정할 메뉴번호");
		int id = s2.nextInt();//메뉴번호 스캐너
		if(id<1 || id>this.alName.size()) {
			System.out.println("잘못된 입력입니다");
		}
		System.out.println("이 이름으로 변경합니다 ");
		String nm = s2.nextLine(); //변경할 메뉴 이름 스캐너
		System.out.println("이 가격으로 변경합니다");
		int npr = s2.nextInt(); //변경할 가격 스캐너
		this.alName.set(id-1,nm);
		this.alPrice.set(id-1,npr);
		System.out.println("메뉴 변경 완료");
		System.out.println("");
	}

	void deleteMenu() {//remove arraylist 활용
		System.out.println("삭제할 메뉴번호 입력");
		Scanner s3=new Scanner(System.in);
		int num = s3.nextInt();
		this.alName.remove(num-1);
		if(num<1 || num>this.alName.size()) {
			System.out.println("메뉴 길이보다 큰 번호가 입력 됨");
			return;
		}
		System.out.println("삭제 되었습니다.");
		System.out.println("");
	}
	
	void showMenu() { //alName, alPrice 출력.
		System.out.println("목록보기");
		for(int i=0; i<alName.size(); i++) {
			System.out.println((i+1)+"."+"메뉴명: "+ alName.get(i)+", "+"가격: "+ alPrice.get(i));
		}	
		System.out.println("");
	}
	
	void save() throws IOException { //ArrayList alName과 alPrice를 menu.txt에 저장.
		File file=new File("d:/menu.txt");
		final BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		for (int i = 0; i < alName.size(); i++) {
			final String name = alName.get(i);
			final int price = alPrice.get(i);
			
			bw.write(name + "," + price); 
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		System.out.println("메뉴가 txt파일로 저장 되었습니다.");
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
