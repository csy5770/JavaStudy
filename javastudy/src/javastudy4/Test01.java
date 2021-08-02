package javastudy4;

import java.util.Scanner;
import pck.Reuse;
public class Test01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Test02 t=new Test02();
		t.setField(10);
		t.setField("Hello");
		System.out.println(t.getT1()+","+t.getT2());
		//t.setK(7);
		System.out.println(t.getK());
		Test02 ta=new Test02();
		System.out.println(ta.getK());
		
		Reuse rus = new Reuse();
	}

}
