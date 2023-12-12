package ex03;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 :");
        int input = sc.nextInt();

        System.out.print(input +"의 약수 :");
        for (int i=1; i<=input; i++){

            int div = input%i;
            if (div==0){
                System.out.print(i + " ");
            
            }
        }

        System.out.print("\n");


        sc.close();
    }
    
}
