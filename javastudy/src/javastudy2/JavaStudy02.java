package javastudy2;

public class JavaStudy02 {

	public static void main(String[] args) {
		//for�� ������ 9��
		int n = 9;
		for(int i=1; i<10; i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
		System.out.println("");
		
		//for �� ������ (2~9��)
		for(int a=2; a<10; a++) {
			for(int b=1; b<10; b++) {
				System.out.println(a+"x"+b+"="+(a*b));
			}
			System.out.println("");
		}
		
	}

}
