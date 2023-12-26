package ex12.protected2;

import ex12.protected1.A;

public class protected1 {

  public static void main(String[] args) {
    A a = new A();
    // a.num1 =1;
    // a.num2 =2;
    // a.num3 =3;
    a.num4 = 4;
    B b = new B();
    // b.num1=1;
    // b도 num2에 접근 불가능이라 이것도 안 됨
    // b.num2=2;
    // 같은 패키지이지만 B클래스의 자식 클래스가 아니라 접근 불가능
    // b.num3=3;
    b.num4 = 4;
  }
}
