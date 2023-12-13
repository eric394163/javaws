package ex04;

import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;

        do {
            System.out.print("입력 : ");
            ch = sc.next().charAt(0);
            System.out.println("문자 : "+ch);

        } while (ch != 'q');

        sc.close();

    }
}
