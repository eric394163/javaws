package ex08;

public class Overload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.2,2.4));
        System.out.println(sum(1,2,3));
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static double sum(double num1, double num2){
        return num1+num2;
    }

    //위 메소드와 매개변수의 개수도 같고 자료형도 같아서 메서드 오버로딩 X
    // public static double sum(int num1, int num2){
    //     return num1+num2;
    // }

    public static  int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    
}
