package javastudy;

import java.util.Scanner;

public class JavaStudy5 {

	public static void main(JavaStudy1[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		switch(str) {
		case "a","A" :
			System.out.println("Apple");
			break;
		case "b","B" :
			System.out.println("Banana");
			break;
		default :
			System.out.println("not solved");
		}
		System.out.println("Exit");
		s.close();
	}
}
