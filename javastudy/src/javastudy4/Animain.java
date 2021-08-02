package javastudy4;

public class Animain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		System.out.println("눈"+animal.eye_count);
		System.out.println("발"+animal.feet_count);
		
		Human man = new Human();
		
		System.out.println("인간 눈"+man.eye_count);
		System.out.println("인간 발"+man.feet_count);
		man.run();
		man.sound();
	}

}
