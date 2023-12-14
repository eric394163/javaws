package ex05;

public class arrayex1 {
    public static void main(String[] args) {
        //인덱스 0부터 4까지 0으로 초기화 (가장 많이 사용)
        int arr1[] = new int[5];

        //5의 크기를 가진 초기화된 배열, 다시 초기화 가능 (테스트용)
        int arr2[] = new int[] {1,2,3,4,5};
        arr2 = new int[] {1,2,3,4,5};

        //선언과 동시에 초기화하는 경우, 나중에 다시 초기화 불가능
        int arr3[] = {1,2,3,4,5};
        arr3[] = {1,2,3,4}
    }
    
}
