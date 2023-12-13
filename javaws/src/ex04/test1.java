package ex04;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 성적 :");
        int kor = sc.nextInt();
        System.out.print("수학 성적 :");
        int math = sc.nextInt();
        System.out.print("영어 성적 :");
        int eng = sc.nextInt();

        int sum = kor+math+eng;
        int avg = sum/3;

        System.out.printf("총점 : %d, 평균 : %d",sum,avg);

        System.out.println("\n");

      
        sc.close();
    }
}
