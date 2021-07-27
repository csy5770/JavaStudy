package javastudy2;

import java.util.Scanner;

public class JavaStudy09 {

	public static void main(String[] args) {
		// 1~n 합계 구하기
		System.out.print("입력 값 까지의 합계: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum = 0;//합계
		
		for(int i=1; i<=a; i++) {
			sum+=i;
		}
		System.out.println(sum);
		s.close();
	}

}
