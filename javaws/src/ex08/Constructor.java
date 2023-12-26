package ex08;

public class Constructor {
    public static void main(String[] args) {
        // 기본 생성자를 호출 = A클래스에 생성자가 있어서 기본 생성자가 자동추가 안 됨 ( 에러발생 )
        // A a=new A(); 
        A a = new A(2);
        System.out.println(a.num);  
        A a1 = new A(1.3); 
        System.out.println(a1.num);   
        A a2 = new A(a1); 
        System.out.println(a2.num);   
    }
    
}

class A{
    int num;

    public A(int num2){
        num = num2;
    }
    public A(double num2){
        num = (int) num2;
    }
    public A(A a){ //A 객체에 있는 a 가져와서 num에 넣기
        num = a.num;
    }
}
