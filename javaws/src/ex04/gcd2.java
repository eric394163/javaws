package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class gcd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 :");
        int input1 = sc.nextInt();
        System.out.print("두 번째 수 :");
        int input2 = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        // for (int i =1; i<input1+1; i++){
        //     if(input1%i==0){
        //         if(input2%i==0){
        //             result.add(i);
        //         }
        //     }
        // }
        for (int i =1; i<input1+1; i++){
            if(input1%i==0 && input2%i==0){
                    result.add(i);
            }
        }

        int gcd =0;

        for (int i = 0; i < result.size(); i++) {
            if ( gcd<result.get(i)){
                gcd = result.get(i);
            }

            
        }

        System.out.println("두 수의 공약수 : " + result + "최대공약수 : "+gcd);

        sc.close();
    }
    
}
