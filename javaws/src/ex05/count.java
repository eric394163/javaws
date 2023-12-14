package ex05;

import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[5];

        int saveNum[] = new int[5];

        System.out.print("1 - 5 사이 정수 5개 입력 :");
        for (int i = 1; i < nums.length+1; i++) {
            nums[i-1] = sc.nextInt();
            saveNum[nums[i-1]]++;
        }

        // System.out.print("1 - 5 사이 정수 5개 입력 :");
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i]=sc.nextInt();
        // }


        // for (int i = 0; i < nums.length; i++) {

        //     switch (nums[i]) {
        //         case 1:
        //             saveNum[0]=saveNum[0]+1;
        //             break;
            
        //         case 2:
        //             saveNum[1]=saveNum[1]+1;
        //             break;
            
        //         case 3:
        //             saveNum[2]=saveNum[2]+1;
        //             break;
            
        //         case 4:
        //             saveNum[3]=saveNum[3]+1;
        //             break;
            
        //         case 5:
        //             saveNum[4]=saveNum[4]+1;
        //             break;
            
        //         default:
        //             break;
        //     }
            
        // }

        for (int i = 1; i < nums.length+1; i++) {
            System.out.printf("%d : %d \n",i,saveNum[i]);
        }



        sc.close();
    }
    
}
