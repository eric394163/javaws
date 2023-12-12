package ex03;

import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 :");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0){
            if (num1 % 3 == 0){
                System.out.println("6의 배수");
            } else {
                System.out.println("2의 배수");
            }
            
        }else{
            System.out.println("2, 6의 배수 아님");
        }


        sc.close();
    }
    
}
