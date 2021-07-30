package javastudy3;



public class Car {
	private String nColor;
	private int maxSpeed;
	private int nSpeed;
	private int guest;
	private String modelName;
	private int nWheel;

	/* 동작=메서드(함수)=메서드(Java)/멤버함수(C++)
	 * 반환 값 메소드명(매개변수 s) {
	 * ~~~
	 * return 3*2;
	 * }
	 */
	Car() {
		this.nColor="blue";
		this.guest=4;
		this.maxSpeed=240;
		this.nSpeed=0;
	}
	Car(String c, int g, int m, int n, String mn, int nw) {
		this.nColor=c;
		this.guest=g;
		this.maxSpeed=m;
		this.nSpeed=n;
		this.modelName=mn;
		this.nWheel=nw;
	}
	void drive(int x) {
		this.nSpeed=x;
	}
	void stop() {
		this.nSpeed=0;
	}
	public String getnColor() {
		return nColor;
	}
	public void setnColor(String nColor) {
		this.nColor = nColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	public int getnSpeed() {
		return nSpeed;
	}
	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getnWheel() {
		return nWheel;
	}
	public void setnWheel(int nWheel) {
		this.nWheel = nWheel;
	}
}
