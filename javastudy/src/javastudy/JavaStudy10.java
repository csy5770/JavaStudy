package javastudy;

import java.util.Scanner;

public class JavaStudy10 {

	public static void main(String[] args) {
		/*
		 * 1. ����� �Է��� ����
		 * 2. �Է� ���� 'x'�� "���α׷� ����"�� ����ϰ� ���α׷� ����.
		 * 3. �Է� �� 
		 * 		(a) 'm'�̸� "�޴�����Ʈ"�� ���
		 * 		(b) 'o'�� "�ֹ�"�� ���
		 * 		(c) 's'�� "������Ȳ" ���.
		 * 4. 1.�� ���ư���.
		 */
		Scanner s = new Scanner(System.in);
		//Scanner s��� ��ü �޼��带 ����.
		String str = s.nextLine();
		// s.nextLine() ��������� ������ ������ ���ڿ��� �Է¹޴� �޼���(�Լ�)
		do {
			str = s.nextLine();
			if(str.equals("m")|| str.equals("M")) {
				System.out.println("�޴�");
			}
			else if(str.equals("o")|| str.equals("O")) {
				System.out.println("�ֹ�");
			}
			else if(str.equals("s")|| str.equals("S")) {
				System.out.println("����");
			}
			else {
				System.out.println("�߸� �� �Է�");
			}
			
		} while(!str.equals("x")||!str.equals("X"));
		System.out.println("����");
		s.close();
	}

}

