package ex02;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("두 정수와 연산자 입력 (예 : 1 + 2):");
        String input = scan.nextLine();
        String[] inputs = input.split(" ");
        int num1 = Integer.parseInt(inputs[0]);
        String op = inputs[1];
        int num2 = Integer.parseInt(inputs[2]);

        if (op.equals("+")){
            int sum = num1+num2;
            System.out.println(sum);
        }else if (op.equals("-")){
            int sub = num1-num2;
            System.out.println(sub);
        }else if (op.equals("*")){
            int mul = num1*num2;
            System.out.println(mul);
        }else{
            double div = num1/num2;
            System.out.println(div);
        }



        scan.close();
    }
    
}
