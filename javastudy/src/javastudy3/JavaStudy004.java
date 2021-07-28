package javastudy3;
/**
 * 함수
 * (1) 함수 선언
 * (2) 함수 호출 => 함수를 실행시킨다.
 * 
 * 변수 명명규칙
 * 
 * 반환 값의 타입 함수명(전달되는 변수) {
 *  실행 내용
 *  }
 *  public static void main(String[] args) 
 *  -> 함수명은 main , void는 return 이 없음을 의미.
 *  전달되는 데이터형태, 위에선 문자배열(String[]) args는 변수명!
 */
public class JavaStudy004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<10;i++) {
			show(i); // 함수를 호출
			System.out.println("");
		}
	}
	public static void show(int i) {
		for(int j=2; j<10; j++) {
			System.out.println(i+"x"+j+"="+(i*j));
		}
	}
}
