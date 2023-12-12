package ex03;

import java.util.Scanner;

public class forprimenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int cnt = 0;
        
        for (int i = 1; i < input + 1; i++) {
            int divNum = input % i;
            if (divNum == 0) {
                cnt++;
            }
        }
        if(cnt == 2){
            System.out.println("소수");
        }else{
            System.out.println("소수아님");
        }
        

        sc.close();
    }

}
