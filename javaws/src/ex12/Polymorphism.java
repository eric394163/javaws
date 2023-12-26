package ex12;

public class Polymorphism {

    public static void main(String[] args) {

        Remocon r = new Remocon();
        Tv tv = new Tv();
        AirConditioner aircon = new AirConditioner();
        r.turnOn(tv);
        r.turnOn(aircon);

    }

}

class Remocon {

    // 매개변수의 다향성을 사용해서 turnOn 메서드 한 개만 생성
    void turnOn(EletronicProduct target) {
        System.out.println("제품이 켜졌습니다");
    }
}

class EletronicProduct {

}

class Tv extends EletronicProduct {

}

class AirConditioner extends EletronicProduct {

}