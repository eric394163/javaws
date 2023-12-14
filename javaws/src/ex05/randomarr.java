package ex05;

public class randomarr {

    public static void main(String[] args) {
        int min =1, max = 9;

        int arr[] = new int[3];

        System.out.print("랜덤 숫자 3개 :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max-min+1)+min);
            System.out.print(arr[i]);
        }

        
        
    }
    
}
