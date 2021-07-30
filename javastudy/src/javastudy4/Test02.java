package javastudy4;

public class Test02 {
	static int k=-1;
	private int t1;
	private String t2;
	
	//생성자 오버로딩 , 다형성.
	public void setField(int i) {
		this.t1=i;
	}
	public void setField(String s) {
		this.t2=s;
	}
	public int getT1() {
		return this.t1;
	}
	public String getT2() {
		return this.t2;
	}
	public static int getK() {
		return k;
	}
}
