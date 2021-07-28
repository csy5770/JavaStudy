package javastudy3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStudy003 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<Integer>();
		int sum = 0; //합계 변수
		
		while(true) { //break 조건 걸리기 전까지 반복 실행
			System.out.println("점수 입력: ");
			int n = s.nextInt();
			
			if(n==-1) { //스캐너에 -1을 입력하면 while문 break.
				System.out.println("종료");
				break;
			}
			score.add(n); //score ArrayList에 입력 값 추가
			sum=sum+n; //합계 = 합계 + 입력 점수 *입력할 때마다 이전 값에 계속 추가.
			System.out.println("합계에 추가됨");
			
			
		}
		System.out.println("점수표"); //while 루프 종료후(-1 입력후) 점수표 출력
		for(int i=0; i<score.size(); i++) { //i <배열 크기(score.size)동안 실행
			System.out.println(score.get(i));
		}
		System.out.println("총합: "+sum);
		System.out.println("평균: "+sum/score.size());
		s.close();
	}
	
}
