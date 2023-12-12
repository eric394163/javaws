package ex03;

import java.util.Scanner;

public class switchex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("두 정수와 연산자 입력 (예 : 1 + 2):");
        String input = scan.nextLine();
        String[] inputs = input.split(" ");
        int num1 = Integer.parseInt(inputs[0]);
        String op = inputs[1];
        int num2 = Integer.parseInt(inputs[2]);

        switch (op) {
            case "+":
                int sum = num1+num2;
                System.out.println(sum);
                break;
            case "-":
                int sub = num1-num2;
                System.out.println(sub);
                break;
            case "*":
                int mul = num1*num2;
                System.out.println(mul);
                break;
            case "/":
                double div = num1/num2;
                System.out.println(div);
                break;
            default :
                System.out.println("에러");

        } 


        scan.close();
    }
}
    

