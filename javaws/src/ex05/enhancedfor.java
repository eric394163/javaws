package ex05;

public class enhancedfor {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            System.out.println(tmp + " ");
        }

        System.out.println();

        for (int tmp : arr) {
            System.out.println(tmp + " ");
        }
        System.out.println();
    }

}
