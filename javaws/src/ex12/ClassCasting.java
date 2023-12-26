package ex12;

public class ClassCasting {
    public static void main(String[] args) {

        // 업캐스팅 : 묵시적 클래서 형변환
        Parent p1 = new Child(1, 2);
        p1.print();

        // print() 기능은 부모 클래스에도 있는 기능이기에 호출가능
        // print2()는 자식 클래스에만 있는 기능이라 부모 인스턴스가 호출할 수 없음
        // 기능은 있지만 접근 할 수 없음
        // p1.print2();

        // 다운 캐스팅 : 명시적 클래스 형변환
        // 클래스 형변환을 반드시 표시
        // 예외가 발생함 (안 되는 경우)
        // // 부모 인스턴스를 자식 인스턴스에 저장하려고 할 때
        // Child c2 = (Child) new Parent(1);
        // c2.print();
        // c2.print2();

        // 다운캐스팅이 되려면
        // 1. 업캐스팅으로 부모 인스턴스에 자식 인스턴스가 저장되어야 함
        // 2. 업 캐스팅 된 부모 인스턴스를 자식 인스턴스에 저장

        Parent p3 = new Child(10, 20);

        Child c3 = (Child) p3;

        c3.print();
        c3.print2();

        
        //다운캐스팅을 통해 부모 인스턴스로 자식 인스턴스의 메서드인 print2 호출 
        Parent p4 = new Child(30, 40);
        ((Child) p4).print2();

    }

}

class Parent {
    int num1;

    void print() {
        System.out.println("num1 : " + num1);
    }

    public Parent(int num1) {
        this.num1 = num1;
    }
}

class Child extends Parent {

    int num2;

    void print() {
        super.print();
        System.out.println("num2 :" + num2);
    }

    void print2() {

        System.out.println("자식 클래스 메서드 입니다.");
    }

    public Child(int num1, int num2) {
        super(num1);
        this.num2 = num2;
    }

}