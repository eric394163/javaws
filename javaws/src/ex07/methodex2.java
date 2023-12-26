package ex07;

public class methodex2 {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        initArr(arr1);
        printArr(arr1); // 이러면 0 0 0 0 0 으로 나옴

        int[] arr2 = new int[5];
        initArr2(arr2);
        printArr(arr2);

    }

    public static void printArr(int[] arr) {
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }

    // 잘못된 메서드
    public static void initArr(int arr[]) {
        arr = new int[10]; // 새로 만든 배열에 ( 이걸 주석 처리하면 됨 )
        for (int i = 0; i < arr.length; i++) { // 값을 넣음
            arr[i] = i + 1;
        }
    }

    // 올바른 메서드
    public static void initArr2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    // 정수가 주어지면 정수 크기에 배열을 생성하고,
    // 배열에 1부터 순차적으로 저장하여 만들어진 배열을 알려주는 메서드
    public static int[] initArr3(int length) {
        int arr[]=new int[length];
        for (int i = 0; i <length; i++) {
            arr[i] = i+1;
            
        }
        
        return arr;
    }

}
