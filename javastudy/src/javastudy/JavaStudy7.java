package javastudy;

public class JavaStudy7 {

	public static void main(String[] args) {
		int n = 1; //1~12 ��� (while Ȱ��)
		while(n<=12) {
			System.out.println(n);
			n++;
		}
		System.out.println(""); //���� ����(����)
		
		int a = 1; //1~100 ��� (while Ȱ��)
		while(a<=100) {
			System.out.println(a);
			a++;
		}
		System.out.println(""); //���� ����(����)
		
		int b = 1; //1~100���� �� Ȧ���� ���(while,if Ȱ��)
		while(b<=100) {
			if(b%2==1) {//% ������ ������. 3%2=1.
				System.out.println(b);
			}
			b++;
		}
		System.out.println(""); //���� ����(����)
		
		int c = 1; //1~100������ 5�� ����� ���(while,if Ȱ��)
		while(c<=100) {
			if(c%5==0) {
				System.out.println(c);
			}
			c++;
		}
	}

}
