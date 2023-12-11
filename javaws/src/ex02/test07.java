package ex02;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("성적 입력 :");

        int num1 = scan.nextInt();

        if (num1<0 || num1>100){
            System.out.println("잘못된 점수");
        }else if (num1 <=59){
            System.out.println("F");
        }else if (num1 <=69){
            System.out.println("D");
        }else if (num1 <=79){
            System.out.println("C");
        }else if (num1 <=89){
            System.out.println("B");
        }else{
            System.out.println("A");
        }

        scan.close();
    }
    
}
