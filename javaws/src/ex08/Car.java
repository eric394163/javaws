package ex08;

public class Car {
    // 정보 : 멤버 변수
    double weight;
    String brand;
    int category;
    int color;
    String[] tires;
    String carName;
    int carYear;
    boolean power;
    int speed;
    boolean leftLight;
    boolean rightLight;

    // 기능 : 메서드

    // 시동 켜기,끄기
    public void powerOnOff() {
        power = !power;
        if (power) {
            System.out.println("시동켜짐");
        } else {
            System.out.println("시동꺼짐");
        }
    }

    // 가속
    public void speedUp() {
        speed++;
    }

    // 감속
    public void speedDown() {
        speed--;
    }

    // 좌측 우측 깜빡이 켜키,끄기 (위: 우측 1, 가운데: 꺼짐 0, 아래: 좌측 -1)
    public void lightOnOff(int direction) {
        switch (direction) {
            case 1:
                rightLight = true;
                leftLight = false;

                break;

            case 0:
                rightLight = false;
                leftLight = false;

                break;

            case -1:
                rightLight = false;
                leftLight = true;

                break;

        }

    }

    public  void println(){
        System.out.println("시동 : "+power);
        System.out.println("속력 : "+speed);
        System.out.println("좌측 전조등 : "+leftLight);
        System.out.println("우측 전조등 : "+rightLight);
    }
}
