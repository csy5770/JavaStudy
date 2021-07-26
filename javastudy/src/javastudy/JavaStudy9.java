package javastudy;

import java.util.Scanner;

public class JavaStudy9 {

    public static void main(String[] args) {
        int a = 0;
        Scanner s = new Scanner(System.in);
        
        do{
            a = s.nextInt();
            System.out.println("입력 값 :" + a);  
        }while(a != 10);  

        System.out.println("종료");
        s.close();
    }
}

