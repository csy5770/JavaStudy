package javastudy3;

import java.util.ArrayList;

public class JavaStudy002 {

	public static void main(String[] args) {
		int[] pnt = new int[5]; //default =0
		//String[] studentName=new String[500];//구식.
		
		ArrayList<String> studentName=new ArrayList<String>();//트렌드 방식
		studentName.add("최");
		studentName.add("서");
		studentName.add("영");
		for(int i=0; i<studentName.size(); i++) {
			//ArrayList는 length아닌 size
			System.out.println(studentName.get(i));
		}
		System.out.println("");
		studentName.set(0, "김");
		studentName.set(2, "형(스카이캐슬 아님)"); //수정(replace)
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i));//조회
		}
		studentName.remove(2); // index를 통해서
		studentName.remove("형");// value를 통해서
		studentName.clear(); //delete all 모두 삭제
	}

}
