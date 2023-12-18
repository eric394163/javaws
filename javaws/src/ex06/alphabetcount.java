package ex06;

import java.util.Scanner;

public class alphabetcount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26];

        System.out.println("문자열 입력 :");
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            // System.out.println(ch);

            arr[ch-'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                char ch = (char)('a'+i);
                System.out.println(ch + ":"+arr[i]);
                
            }
        }
        // for(int count:arr){
        //     System.out.println(count);

        // }

        sc.close();

    }

}
