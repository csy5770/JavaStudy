package javastudy;

import java.util.Scanner;

public class JavaStudy9 {

    public static void main(String[] args) {
        int a = 0;
        Scanner s = new Scanner(System.in);
        
        do{
            a = s.nextInt();
            System.out.println("�Է� �� :" + a);  
        }while(a != 10);  

        System.out.println("����");
        s.close();
    }
}

