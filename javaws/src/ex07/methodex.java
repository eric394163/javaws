package ex07;

public class methodex {
    // 매개 변수가 기본형 변수인 경우와 참조형 변수인 경우의 차이

    public static void main(String[] args) {

        int num1 = 10, num2 = 20;
        System.out.println("num1 =" + num1 + "num2 =" + num2);
        swap1(num1, num2);
        System.out.println("num1 =" + num1 + "num2 =" + num2);

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 10, 20, 30, 40, 50 };

        System.out.print("arr1 =");
        printArr(arr1);
        System.out.print("arr1 =");
        printArr(arr2);
        swap2(arr1, arr2);
        System.out.println();
        System.out.print("arr1 =");
        printArr(arr1);
        System.out.print("arr1 =");
        printArr(arr2);

    }

    // 정수 배열을 콘솔에 한 줄로 출력하는 메서드

    public static void printArr(int[] arr) {
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }

    // 두 정수를 바꾸는 메서드
    public static void swap1(int num1, int num2) {

        int tmp = num1;
        num1 = num2;
        num2 = tmp;

        return;
    }

    // 두 배열을 바꾸는 메서드
    public static void swap2(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;

        }

        return;
    }

}
