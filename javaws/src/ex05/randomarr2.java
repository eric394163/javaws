package ex05;

public class randomarr2 {
    public static void main(String[] args) {
        int min = 1, max = 9;

        int arr[] = new int[3];
        int count = 0; // 배열에 저장된 중복되지 않은 수의 개수 

        while(count <3 ){ // 배열에 중복되지 않은 수가 3보다 작으면 반복 

            int r = (int)(Math.random()*(max-min+1)+min);

            boolean duplicated = false; // 중복 여부 확인 (false=중복 x)

            for(int i =0; i < count; i++){
                if(arr[i]==r){
                    duplicated = true;
                    break;
                }
            }

            if(!duplicated){
                arr[count]=r;
                count++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
}
