package javastudy4;

public class Tire {
	int maxRotation; // 수명(~번 회전 후 수명이 끝)
	int accRotation; // 현재까지 회전한 횟수
	String location; //
	
	Tire(String loc, int maxRot) {
		this.location=loc;
		this.maxRotation=maxRot;
	}
	boolean roll() {
		++this.accRotation;
		if(this.accRotation<this.maxRotation) {
			System.out.println(this.location+"잔여 수명: "+(maxRotation-accRotation));
			return true;
		}
		System.out.println(this.location+"tire 수명 끝");
		return false;
	}
}

