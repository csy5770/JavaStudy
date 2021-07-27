package javastudy2;

import java.util.Scanner;

public class JavaStudy10 {

	public static void main(String[] args) {
		// 팩토리얼!
		System.out.print("팩토리얼 연산할 양의 정수를 입력: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fac = 1;//팩토리얼 결과 값이 저장될 변수.
		
		for(int i=1; i<=n; i++) {
			fac = fac*i;
		}
		System.out.print("결과: "+ fac);
		s.close();
	}

}
