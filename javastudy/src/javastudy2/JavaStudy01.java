package javastudy2;

public class JavaStudy01 {

	public static void main(String[] args) {
		// 1~100 출력 (for 활용)
		for(int n=1; n<101; n++) {
			System.out.println(n);
		}
		System.out.println("");
		//100 이하 홀수(for 활용)
		for(int i=1;  i<=100; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println("");
		for(int i=1; i<=100; i+=2) {
			System.out.println(i);
		}
	}

}
