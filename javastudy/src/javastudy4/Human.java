package javastudy4;

public class Human extends Animal {
	Human() {
		super();
		this.feet_count=2;
	}
	void run() {
		System.out.println("걷는다.");
	}
	void sound() {
		System.out.println("말한다.");
	}
	void study() {
		System.out.println("공부한다.");
	}
}
