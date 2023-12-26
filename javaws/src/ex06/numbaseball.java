package ex06;

import java.util.Scanner;

public class numbaseball {
    public static void main(String[] args) {
        // 숫자 야구 게임
        // 1-9 사이 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추기
        // S : 숫자가 있고, 위치가 같은 경우
        // B : 숫자가 있지만 위치가 다른 경우
        // O : 일치하는 숫자가 하나도 없는 경우
        // 3S 가 되면 게임 종료

        Scanner sc = new Scanner(System.in);

        int answer[] = new int[3];
        int userNum[] = new int[3];
        int cntS = 0, cntB = 0, cntO = 0;
        int max = 1, min = 9;

        int count = 0;
        while (count < 3) {
            int r = (int) (Math.random() * (max - min + 1) + min);
            boolean duplicated = false;
            for (int i = 0; i < count; i++) {
                if (answer[i] == r) {
                    duplicated = true;
                    break;
                }
            }
            if (!duplicated) {
                answer[count] = r;
                count++;
            }
        }
        for (;;) {
            System.out.print("랜덤으로 생성된 숫자 : ");
            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i]);
            }
            System.out.println();

            System.out.print("입력 : "); // 입력 부분 수정 
            for (int i = 0; i < userNum.length; i++) {
                int input = sc.nextInt();
                userNum[i] = input;
            }
            for (int i = 0; i < userNum.length; i++) {
                System.out.print(userNum[i]);
            }
            System.out.println();

            for (int i = 0; i < answer.length; i++) {
                if (answer[i] == userNum[i]) {
                    cntS++;
                }
                for (int j = 0; j < userNum.length; j++) {
                    if (answer[i] == userNum[j] && cntS == 0) {
                        cntB++;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                if (cntS == 0 && cntB == 0) {
                    cntO=3;
                }else if(cntS>2||cntB>2){
                    cntO=1;
                }else if(cntS>1||cntB>1){
                    cntO=2;
                }else{
                    cntO=0;
                }
                

            }


            System.out.println(cntS + "S" + cntB + "B" + cntO + "O");

            if (cntS == 3) {
                System.out.println("승리");
                break;
            } else {
                cntS = 0;
                cntB = 0;
                cntO = 0;
            }

        }

        sc.close();
    }
}
