package javastudy;

import java.util.Scanner;

public class JavaStudy6 {

	public static void main(JavaStudy1[] args) {
		// ���� �о����(����)
		// 89���� ũ�� A
		// 79 ���� ũ�� B
		// 69 ���� ũ�� C
		// 59 ���� ũ�� D
		// �ܴ̿� F �� ����ϴ� ���α׷�.
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n = Integer.parseInt(str);
		if(n>89) {
			System.out.println("A");
		}
		else if(n>79) {
			System.out.println("B");
		}
		else if(n>69) {
			System.out.println("C");			
		}
		else if(n>59) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
			s.close();
		}
	}

}
