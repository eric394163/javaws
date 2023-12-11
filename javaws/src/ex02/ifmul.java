package ex02;

import java.util.Scanner;

public class ifmul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력 :");
        int num1 = scan.nextInt();

        if (num1%3 == 0){
            System.out.println("3의 배수");
        }

        scan.close();
    }
    
}
