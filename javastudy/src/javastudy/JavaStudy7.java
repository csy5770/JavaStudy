package javastudy;

public class JavaStudy7 {

	public static void main(String[] args) {
		int n = 1; //1~12 출력 (while 활용)
		while(n<=12) {
			System.out.println(n);
			n++;
		}
		System.out.println(""); //공백 생성(엔터)
		
		int a = 1; //1~100 출력 (while 활용)
		while(a<=100) {
			System.out.println(a);
			a++;
		}
		System.out.println(""); //공백 생성(엔터)
		
		int b = 1; //1~100까지 중 홀수만 출력(while,if 활용)
		while(b<=100) {
			if(b%2==1) {//% 나머지 연산자. 3%2=1.
				System.out.println(b);
			}
			b++;
		}
		System.out.println(""); //공백 생성(엔터)
		
		int c = 1; //1~100사이의 5의 배수만 출력(while,if 활용)
		while(c<=100) {
			if(c%5==0) {
				System.out.println(c);
			}
			c++;
		}
	}

}
