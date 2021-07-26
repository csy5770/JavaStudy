package javastudy2;

import java.util.Scanner;

public class JavaStudy07 {

	public static void main(String[] args) {
		// 소수(Prime Number) - 1과 자기 자신으로만 나눠지는 수.
		// n이라는 정수를
		// 2부터 n-1까지 숫자로 n을 나눔.(1과 자기자신으로는 나눠지기 때문)
		// (예) 51이 소수인가? No, %3==0 -> 17로.
		
		// 2~10000 까지 사이의 모든 소수를 구하라.
		System.out.println("이 이하의 소수를 구합니다.");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0; //소수 체크를 위한 정수형 변수
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					a++;//소수가 아닐 경우 + 체크숫자
					
				}
			}
			if(a==1) {//소수 체크 숫자가 1인 i,j 숫자 쌍이면 목록 출력. 
				System.out.print(i +" ");
			}
			a=0; // 이후 체크 숫자 초기화
			s.close();
		}
		
	}

}
