package javastudy3;

public class Auto {

	public static void main(String[] args) {
		Car sonata=new Car("white",4,240,50,"Sonata DN8",4);
			System.out.println("Sonata의 색상: "+ sonata.getnColor());
			System.out.println("Sonata의 탑승인원: "+ sonata.getGuest());
			System.out.println("Sonata의 최고시속: "+ sonata.getMaxSpeed());
			System.out.println("Sonata의 현재시속: "+ sonata.getnSpeed());
			System.out.println("모델명: "+ sonata.getModelName());
			System.out.println("Sonata의 바퀴 수: "+ sonata.getnWheel());
	}

}
