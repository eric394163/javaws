package ex02;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이 입력 :");
        int num1 = scan.nextInt();

        if (num1 >= 20){
            System.out.println("성인");
        }else {
            System.out.println("미성년자");
        }

        scan.close();
    }
    
}
