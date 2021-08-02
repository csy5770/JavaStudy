package javastudy4;

public class CarEx {

	public static void main(String[] args) {
		TireCar car = new TireCar();
		
		for(int i=0;i<=5;i++) {
			int punked=car.run();
			switch(punked) {
			case 1: //fL(front Left)
				System.out.println("왼 앞 펑크");
				break;
			case 2: //fR
				System.out.println("오 앞 펑크");
				break;
			case 3: //bL
				System.out.println("왼 뒤 펑크");
				break;
			case 4: //bR
				System.out.println("오 뒤 펑크");
				break;
			}
			if(punked!=0) break;
		}
	}

}
