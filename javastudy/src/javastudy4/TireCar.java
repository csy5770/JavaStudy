package javastudy4;

public class TireCar {
	Tire frontLeft;
	Tire frontRight;
	Tire backLeft;
	Tire backRight;
	
	TireCar() {
		this.frontLeft=new Tire("왼쪽 앞", 6);
		this.frontRight=new Tire("오른쪽 앞",2);
		this.backLeft=new Tire("왼 뒤",3);
		this.backRight=new Tire("왼 오",4);
	}
	int run() {
		System.out.println("자동차가 달림");
		if(frontLeft.roll()==false) {
			stop(); return 1;
		}
		if(frontRight.roll()==false) {
			stop(); return 2;
		}
		if(backLeft.roll()==false) {
			stop(); return 3;
		}
		if(backRight.roll()==false) {
			stop(); return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("차량 정지.");
	}
}

