package ex02;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("월 입력 :");
        int num1 = scan.nextInt();

        if (num1 < 1 || num1 >12) {
            System.out.println("에러");
        }else if (num1 <=2 || num1==12) {
            System.out.println("겨울");
        }else if (num1<=5) {
            System.out.println("봄");
        }else if (num1<=8){
            System.out.println("여름");
        }else{
            System.out.println("가을");
        }

        scan.close();

    }

}
