package javastudy2;

import java.util.Scanner;

public class JavaStudy07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("이 이하의 소수를 출력합니다.");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j;
		
		for(int i=2; i<=n; i++) {
			for(j=2; j<i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.print(i +" ");
			}
			s.close();
		}
	}

}
