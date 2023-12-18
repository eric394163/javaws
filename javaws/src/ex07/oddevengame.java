package ex07;

import java.util.Scanner;

public class oddevengame {

    public static void printMenu() {

        System.out.println("메뉴");
        System.out.println("1.새 게임");
        System.out.println("2.결과 조회");
        System.out.println("3.프로그램 종료");
        System.out.print("메뉴 선택 : ");

    }

    public static int newGame() {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int min = 1, max = 100;

        int num = (int) (Math.random() * (max - min + 1) + min);
        if (num % 2 == 0) {
            result = 0;
        } else {
            result = 1;
        }

        System.out.print("0(짝수) 또는 1(홀수) 입력 : ");
        int input = sc.nextInt();
        System.out.print("랜덤 숫자 : " + num);
        if (input == result) {
            // 승리 1 반환
            return 1;

        } else {
            // 패배 0 반환
            return 0;
        }
    }

    public static void scoreBoard(int winCnt, int loseCnt) {

        System.out.println(winCnt + "승" + " " + loseCnt + "패");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int winCnt = 0, loseCnt = 0;
        int menu = 0;

        do {
            printMenu();
            menu = sc.nextInt();
            System.out.println("================");

            switch (menu) {
                case 1:
                    int result = newGame();
                    if (result == 1) {
                        System.out.println("승리");
                        winCnt++;

                    } else {
                        System.out.println("패배");
                        loseCnt++;
                    }

                    break;
                case 2:
                    scoreBoard(winCnt, loseCnt);

                    break;
                case 3:
                    System.out.println("프로그램 종료 ");
                    break;

                default:
                    System.out.println("잘못된 메뉴 선택");
                    break;
            }

        } while (menu != 3);

        sc.close();
    }

}
