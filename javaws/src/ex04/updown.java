package ex04;

import java.util.Scanner;

public class updown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;

        int cnt = 0;
        int record = 0;
        int maxRecord = 9999;

        do {
            System.out.println("메뉴");
            System.out.println("1. 새게임");
            System.out.println("2. 최고기록 확인");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택 :");
            menu = sc.nextInt();

            switch (menu) {
                case 1:

                    int inputNum = 0;
                    int min = 1, max = 100;
                    int r = (int) (Math.random() * (max - min + 1) + min);
                    System.out.println(r);

                    for (; inputNum != r;) {
                        System.out.print("정수입력 :");
                        inputNum = sc.nextInt();
                        cnt++;
                        if (inputNum != r) {
                            System.out.println("오답");
                            if (inputNum > r) {
                                System.out.println("down");
                            } else {
                                System.out.println("up");
                            }

                        } else {
                            System.out.println("정답");
                            record = cnt;
                            cnt = 0;
                            break;

                        }
                    }

                    if (record <maxRecord) {
                        maxRecord = record;

                    }
                    break;

                case 2:
                    if (maxRecord == 9999) {
                        System.out.println("기록 없음");
                    } else {
                        System.out.println("최고기록 :" + maxRecord);
                    }

                    break;

                case 3:
                    break;

            }

        } while (menu != 3);

        System.out.println("프로그램 종료");

        sc.close();
    }

}
