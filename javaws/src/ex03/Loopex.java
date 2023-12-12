package ex03;

import java.util.Scanner;

public class Loopex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';

        for(;ch !='q';){
            System.out.print("입력 :");
            ch = sc.next().charAt(0);
            System.out.println("문자 : "+ch);

        }

        sc.close();
    }
    
}
