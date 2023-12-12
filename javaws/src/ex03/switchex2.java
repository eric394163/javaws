package ex03;

import java.util.Scanner;

public class switchex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월 입력 :");
        int num1 = scan.nextInt();
        switch (num1){
            case 1: case 2: case 12: //case 1, 2, 12 : 도 가능 
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default :
                System.out.println("에러");
        }

        scan.close();

    }

}
