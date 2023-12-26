package ex12.protected2;

import ex12.protected1.A;

public class B extends A {

    public void print() {
        // System.out.println(num1);

        // num2는 default이기에 다른 패키지에 있는 클래스에서 접근 X
        // System.out.println("num2 : "+num2);

        // protected 이여서 다른 패키지와 상관 없이 자식 클래스에서 접근 O
        System.out.println("num3 : " + num3);

        // public 이여서 접근 가능
        System.out.println("num4 : " + num4);
    }

}
