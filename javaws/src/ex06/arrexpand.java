package ex06;

public class arrexpand {

    public static void main(String[] args) {
        int arr[] = new int[5];

        int count = 10;
        for (int i = 0; i < arr.length; i++) {
            if (i+1>arr.length) {
                int tmp[] = new int[arr.length+5];
                System.arraycopy(arr, 0, tmp, 0, arr.length);
                arr =tmp;                
            }
            arr[i]=i+1;
        }
        for(int tmp : arr){
            System.out.println(tmp);
        }
    }
    
}
