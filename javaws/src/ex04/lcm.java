package ex04;

import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("첫 번째 정수 입력 :");
        int num1 = sc.nextInt();

        System.out.printf("두 번째 정수 입력 :");
        int num2 = sc.nextInt();

        int gcd =0;

        for (int i =1; i<num1+1; i++){
            if(num1%i==0 && num2%i==0){
                    gcd=i;
            }
        }

        int lcm = (num1*num2)/gcd;

        System.out.println(lcm);



        sc.close();
    }
    
}
