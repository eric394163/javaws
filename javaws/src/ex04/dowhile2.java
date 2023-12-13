package ex04;

import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;

        do{
            System.out.println("메뉴");
            System.out.println("1. 새게임");
            System.out.println("2. 최고기록 확인");
            System.out.println("3. 프로그램 종료");
            System.out.println("메뉴 선택 :");
            menu = sc.nextInt();
            
        }while(menu !=3);

        System.out.println("프로그램 종료");

        

        sc.close();
    }
    
}
