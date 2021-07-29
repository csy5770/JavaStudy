package javastudy3;

import java.util.ArrayList;

public class Car {
	String nColor;
	int maxSpeed;
	int nSpeed;
	int guest;
	String modelName;
	int nWheel;
	ArrayList<Integer> dailyRun;
	/* 동작=메서드(함수)=메서드(Java)/멤버함수(C++)
	 * 반환 값 메소드명(매개변수 s) {
	 * ~~~
	 * return 3*2;
	 * }
	 */
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
	public int getnSpeed() {
		return nSpeed;
	}
	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
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
	public ArrayList<Integer> getDailyRun() {
		return dailyRun;
	}
	public void setDailyRun(ArrayList<Integer> dailyRun) {
		this.dailyRun = dailyRun;
	}

}
