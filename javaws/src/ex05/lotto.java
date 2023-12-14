package ex05;

import java.util.Arrays;
import java.util.Scanner;

public class lotto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tmp = new int[7];
        int count = 0;
        int min = 1, max = 9;

        while (count < tmp.length) {
            int r = (int) (Math.random() * (max - min + 1) + min);

            int i;
            for (i = 0; i < count; i++) {
                if (r == tmp[i]) {
                    break;
                }

            }

            if (i == 0) {
                tmp[count++] = r;
            }

        }
        int[] lotto = new int[6];
        System.arraycopy(tmp, 0, lotto, 6);

        int bonus = tmp[6];

        Arrays.sort(lotto);
        System.out.print("당첨번호 :");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();

        int[] user = new int[6];
        System.out.print("입력 번호 : ");
        for (int i = 0; i < user.length; i++) {
            user[i] = sc.nextInt();
        }

        int sameCount = 0;
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < user.length; j++) {
                if (lotto[i] == lotto[j]) {
                    sameCount++;
                    break;
                }
            }
        }

        switch (sameCount) {
            case 6:
                System.out.println("1등");
                break;

            case 5:
                int i = 0;
                for (i = 0; i < user.length; i++) {
                    if (bonus == user[i]) {
                        break;
                    }
                }
                if (i == user.length) {
                    System.out.println("3등");
                } else {
                    System.out.println("2등");
                }
                System.out.println("꽝");
                break;

            case 4:
                System.out.println("4등");
                break;

            case 3:
                System.out.println("5등");
                break;

            default:
                System.out.println("꽝");
                break;
        }

        sc.close();

    }
}
