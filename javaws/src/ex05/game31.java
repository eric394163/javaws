package ex05;

import java.util.Scanner;

public class game31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 1, max = 3;
        int userCnt = 0;
        int gameCnt = 0;
        int comCnt = 0;
        int displayNum = 0;

        for (;;) {
            int comnum = (int) (Math.random() * (max - min + 1) + min);
            switch (comnum) {
                case 1:
                    comCnt = gameCnt + 1;
                    break;
                case 2:
                    comCnt = gameCnt + 2;
                    break;
                case 3:
                    comCnt = gameCnt + 3;
                    break;
            }

            System.out.print("COM : ");
            for (int i = 1; i < comnum + 1; i++) {
                displayNum = gameCnt + i;
                System.out.print(+displayNum);
            }
            System.out.println();
            gameCnt = comCnt;

            if(comCnt==31){
                System.out.println("컴 패배");
                break;
            }
    

            for (;;) {
                System.out.print("유저 :");
                userCnt = sc.nextInt();
                if (userCnt != 0 && userCnt < 4) {
                    break;
                }
            }
            switch (userCnt) {
                case 1:
                    userCnt = gameCnt + 1;
                    break;
                case 2:
                    userCnt = gameCnt + 2;
                    break;
                case 3:
                    userCnt = gameCnt + 3;
                    break;
            }
            gameCnt = userCnt;
            System.out.println("USER : " + userCnt + "gameCnt :" + gameCnt);

            if(userCnt==31){
                System.out.println("유저 패배");
                break;
            }

        }

        sc.close();
    }
}
