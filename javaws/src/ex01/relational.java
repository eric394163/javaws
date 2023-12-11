package ex01;

public class relational {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        System.out.println(String.format("%d > %d : %b", num1, num2, num1 > num2));
        System.out.println(String.format("%d >= %d : %b", num1, num2, num1 >= num2));
        System.out.println(String.format("%d < %d : %b", num1, num2, num1 < num2));
        System.out.println(String.format("%d <= %d : %b", num1, num2, num1 <= num2));
        System.out.println(String.format("%d == %d : %b", num1, num2, num1 == num2));
        System.out.println(String.format("%d != %d : %b", num1, num2, num1 != num2));
    }
    
}
