package algorithm;

import java.util.Scanner;

public class twopointer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numArray = {1,2,3,4,5,6,7,8,9,10};

        int[] sumArray = new int[10];

        for (int i=0; i<10; i++){
            
            if (i==0){
                sumArray[i]=numArray[i];
            }else{
                sumArray[i]=sumArray[i-1]+numArray[i];
            }

            System.out.println("합배열"+sumArray[i]);
        }





        sc.close();
        
    }
    
}
