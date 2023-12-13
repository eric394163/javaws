package ex04;

public class star4 {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= rows - 1; j++) {
                System.out.print(' ');
            }
            for (int j2 = 1; j2 <= 2 * i - 1; j2++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
