package ex06;

import java.util.Scanner;

public class arithemetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opmax = 1, opmin = 3;
        int opNum = (int) (Math.random() * (opmax - opmin + 1) + opmin);

        int max = 1, min = 99;
        int rndNum1 = (int) (Math.random() * (max - min + 1) + min);
        int rndNum2 = (int) (Math.random() * (max - min + 1) + min);

        int answer = 0;

        switch (opNum) {
            case 1:
                
                System.out.printf(rndNum1 + "+" + rndNum2 + "=");
                answer = rndNum1 + rndNum2;

                break;
            case 2:
                
                System.out.printf(rndNum1 + "*" + rndNum2 + "=");
                answer = rndNum1 * rndNum2;
                break;
            case 3:
                
                System.out.printf(rndNum1 + "-" + rndNum2 + "=");
                answer = rndNum1 - rndNum2;
                break;
        }

        int input = sc.nextInt();
        if (input==answer){
             System.out.println("정답");
        }else{
            System.out.println("오답");
        }
       

        sc.close();
    }

}
