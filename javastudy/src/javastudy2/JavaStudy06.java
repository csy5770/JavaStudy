package javastudy2;

public class JavaStudy06 {

	public static void main(String[] args) {
		// 피보나치(while 활용)
		int a = 0;
		int b = 1;
		int c = a+b;
		while(c<10000) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		
	}

}
