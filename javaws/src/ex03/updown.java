package ex03;

import java.util.Scanner;

public class updown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = 0;
        int min =1, max = 100;
        int r = (int)(Math.random()*(max-min+1)+min);
        System.out.println(r);

        for(;inputNum!=r;){
            System.out.print("정수입력 :");
            inputNum = sc.nextInt();
            if (inputNum != r){
                System.out.println("오답");

            }else{
                System.out.println("정답");

            }
        }

        sc.close();
    }
    
}
