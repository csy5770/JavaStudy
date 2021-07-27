package javastudy3;

public class JavaStudy001 {

	public static void main(String[] args) {
		int n= 3;
		String[] a = new String[n];
		a[0]="너";
		a[1]="굴";
		a[2]="아";
		String[] b = new String[n];
		b[0]="굴";
		b[1]="팠";
		b[2]="니";//n이 5이하면 영역 밖 오류.
		String[] c = new String[n];
		c[0]="아";
		c[1]="니";
		c[2]="오";
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
		//Array는 length.
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println("");
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}
	}
	
}
