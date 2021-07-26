package javastudy2;

public class JavaStudy04 {

	public static void main(String[] args) {
		int a=4;//가로, 행 크기.
		int b=1;
		int c=0;
		for(int i=1; i<=a; i++) {
			for(int j=2; j<a+1; j++) {
				if(i%2==1) {
					System.out.print(b+" ");
					b++;
					if(j==a) {
						System.out.println(b);
						b++;
						c=a+b;
					}
				}
				else if(i%2==0) {
					c--;
					System.out.print(c+" ");
					b++;
					if(j==a) {
						c--;
						System.out.println(c);
						b++;
					}
				}
			}
		}

	}

}
