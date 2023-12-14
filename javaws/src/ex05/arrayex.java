package ex05;

import java.util.Scanner;

public class arrayex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] korScore = new int[5];

        int sum=0;

        for (int i = 0; i < korScore.length; i++) {
            System.out.print("성적 입력 :");
            korScore[i] = sc.nextInt();
            sum = sum + korScore[i];
        }

        System.out.println(sum);

        double avg = (double)sum/korScore.length;

        System.out.println("총합"+sum+"평균 : " + avg);

        
        
        
        sc.close();
    }
    
}
