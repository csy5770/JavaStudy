package javastudy;

import java.util.Scanner;

public class JavaStudy6 {

	public static void main(JavaStudy1[] args) {
		// 값을 읽어들임(정수)
		// 89보다 크면 A
		// 79 보다 크면 B
		// 69 보다 크면 C
		// 59 보다 크면 D
		// 이외는 F 를 출력하는 프로그램.
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
