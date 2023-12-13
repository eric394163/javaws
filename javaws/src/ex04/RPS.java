package ex04;

import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;

        int win = 0;
        int draw = 0;
        int lose = 0;

        do {

            System.out.println("====================");
            System.out.println("메뉴");
            System.out.println("====================");
            System.out.println("1. 새게임");
            System.out.println("2. 기록 확인");
            System.out.println("3. 프로그램 종료");
            System.out.println("====================");
            System.out.printf("메뉴 선택 :");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    int min = 1, max = 3;
                    int r = (int) (Math.random() * (max - min + 1) + min);
                    if (r == 1) {
                        r = 'R';
                    } else if (r == 2) {
                        r = 'S';
                    } else {
                        r = 'P';
                    }
                    System.out.println("바위 : R, 가위 : S, 보 : P");
                    char userRSP = sc.next().charAt(0);

                    if (userRSP == r) {
                        System.out.println("무승부");
                        lose += 1;

                    } else if ((userRSP == 'R' && r == 'S') || (userRSP == 'S' && r == 'P')
                            || (userRSP == 'P' && r == 'R')) {
                        System.out.println("승리");
                        win += 1;
                    } else {
                        System.out.println("패배");
                        lose += 1;
                    }
                    // switch (r) {
                    // case 'R':
                    // if (userRSP == 'R') {
                    // System.out.println("무승부");
                    // draw += 1;
                    // } else if (userRSP == 'S') {
                    // System.out.println("패배");
                    // lose += 1;
                    // } else {
                    // System.out.println("승리");
                    // win += 1;
                    // }
                    // break;
                    // case 'S':
                    // if (userRSP == 'R') {
                    // System.out.println("승리");
                    // win += 1;
                    // } else if (userRSP == 'S') {
                    // System.out.println("무승부");
                    // draw += 1;
                    // } else {
                    // System.out.println("패배");
                    // lose += 1;
                    // }
                    // break;
                    // case 'P':
                    // if (userRSP == 'R') {
                    // System.out.println("패배");
                    // lose += 1;
                    // } else if (userRSP == 'S') {
                    // System.out.println("승리");
                    // win += 1;
                    // } else {
                    // System.out.println("무승부");
                    // draw += 1;
                    // }
                    // break;
                    // }
                    break;
                case 2:
                    System.out.printf("승리 : %d , 무승부 : %d , 패배 : %d \n", win, draw, lose);
                    break;
                case 3:
                    break;
            }
        } while (menu != 3);
        System.out.println("프로그램 종료");
        sc.close();
    }

}
