package javastudy3;

public class Auto {

	public static void main(String[] args) {
		Car sonata = new Car();
			sonata.nColor = "white"; //필드(변수)에 직접 접근
			
			//메소드를 통해서 필드(변수)에 접근.
			sonata.setnColor("cream white");
			System.out.println("차량 색상: " +sonata.getnColor());
			sonata.setnSpeed(100);
			System.out.println("현재 속도: "+sonata.getnSpeed()+"km/h");
			sonata.setGuest(4);
			System.out.println("탑승 인원: "+sonata.getGuest()+"명");
			
	}

}
