package javastudy2;

import java.util.Scanner;

public class JavaStudy03 {

	public static void main(String[] args) {
		System.out.println("����� �ܼ��� �Է�");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(n +"x"+i+"="+(n*i));
		}
		s.close();
	}

}
