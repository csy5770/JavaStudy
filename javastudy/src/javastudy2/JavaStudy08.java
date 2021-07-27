package javastudy2;

import java.util.Scanner;

public class JavaStudy08 {

	public static void main(String[] args) {
		//12와 8의 최소공배수 최대 공약수
		System.out.print("첫번 째 수 ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.print("두번 째 수 ");
		int b = s.nextInt();
		
		int big; // a,b 중 큰 변수
		int min=0; // a,b의 최소공배수 변수.
		int max=0; // a,b의 최대공약수 변수.
		
		if(a>=b) {
			big = a;
		}
		else {
			big = b;
		}
		
		for(int i=big; i>=big; i++) {
			if(i%a==0 && i%b==0) {
				min=i;
				break;
				
			}
		}
		for(int i=1; i<=min; i++) {
			if(a%i==0 && b%i==0) {
				max = i;
			}
		}
		System.out.println(a+"와 "+b+"의 최소공배수 " + min);
		System.out.println(a+"와 "+b+"의 최대공약수 " + max );
		s.close();
	}

}
