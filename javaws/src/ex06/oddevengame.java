package ex06;

import java.util.Scanner;

public class oddevengame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int betCoin = 0;
        int coin = 10;
        int result = 0;
        int min = 1, max = 100;

        for (;;) {

            int num = (int) (Math.random() * (max - min + 1) + min);

            System.out.println( "insert coin :");
            for (;;) {
                betCoin = sc.nextInt();
                if (betCoin != 0) {
                    break;
                }else if(betCoin>coin){
                    coin = betCoin;
                    break;
                }else{
                    System.out.println("다시 입력");
                }

            }

            System.out.print("0(짝수) 또는 1(홀수) 입력 : ");
            int input = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("짝수");
                result = 0;

            } else {
                System.out.println("홀수");
                result = 1;
            }

            if (input == result) {
                System.out.println("정답");
                coin = coin + betCoin;
                System.out.print("현재 코인 수 :" + coin);
                System.out.println();

            } else {
                System.out.println("오답");
                coin = coin - betCoin;
                System.out.print("현재 코인 수 :" + coin);
                System.out.println();
            }

            if (coin <= 0) {
                System.out.println("게임 종료 ");
                break;
            }
        }
        System.out.println();

        sc.close();

    }

}
