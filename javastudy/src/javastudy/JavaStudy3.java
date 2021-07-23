package javastudy;

import java.util.Scanner;

public class JavaStudy3 {

	public static void main(JavaStudy1[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();		
		if(str.equalsIgnoreCase("CSY")) {
			System.out.println("CHOI S Y");
		}
		
		s.close();
	}

}
