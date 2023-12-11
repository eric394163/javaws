package ex02;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("정수 입력 : ");
        int num1 = scan.nextInt();
        System.out.println("입력받은 정수 :"+num1);

        System.out.print("실수 입력 :");
        double num2 = scan.nextDouble();
        System.out.println("입력받은 실수 :"+num2);

        System.out.print("한 단어 입력 :");
        String str1 = scan.next();
        System.out.println("입력받은 단어 :"+str1);

        System.out.print("한 문장 입력 :");
        scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println("입력받은 문장 :"+str2);

        System.out.print("문자 입력 :");
        char ch = scan.next().charAt(0);
        System.out.println("입력받은 문자 :" + ch);

        //문자를 읽어오는 메소드는 없어서 next는 공백을 제거한 문자열 가져오고 그 중 첫 글자를 가져오기 

        scan.close();
    }
    
}
