package ex08;

public class CarMain {
    public static void main(String[] args) {
        //Car : 클래스명
        //car : 인스턴스명
        //new : 인스턴스를 생성하는 연산자
        //Car() : 생성자. 멤버변수를 초기화

        Car car = new Car() ;
        car.powerOnOff();
        car.println();

    }
    
}
