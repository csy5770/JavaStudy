package javastudy2;

public class JavaStudy05 {

	public static void main(String[] args) {
		// 피보나치 수열(while)
		int a = 0;
		int b = 1;
		int c = a+b;
		for(int i=1; i<=10000; i++) {
			if(c<=10000) {
				System.out.println(c);
				c=a+b;
				a=b;
				b=c;
				
			}
			
		}
	
		
	}

}
