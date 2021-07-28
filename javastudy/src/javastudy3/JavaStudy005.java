package javastudy3;

public class JavaStudy005 {

	public static void main(String[] args) {
		Student csy = new Student();
			csy.name ="최서영";
			csy.food ="김치 볶음밥";
			csy.age =28;
			csy.height =200;
			csy.weight = 60;
			
			System.out.println("이름: "+ csy.name);
			System.out.println("나이: "+csy.age);
			System.out.println("신장: "+csy.height+"cm");
			System.out.println("체중: "+csy.weight+"kg");
			System.out.println("좋아하는 음식: "+csy.food);
	}

}
