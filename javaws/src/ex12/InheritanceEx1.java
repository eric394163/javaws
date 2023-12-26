package ex12;

public class InheritanceEx1 {

  public static void main(String[] args) {
    Car c1 = new Car("K3", "기아", 4);
    c1.print();
    kiaCar k1 = new kiaCar("레이", 4);
    k1.print();
    hyunCar h1 = new hyunCar("아반떼", 4);
    h1.print();
  }
}

class Car {

  String name, brand;
  int wheelCnt;
  boolean power;
  int speed;

  void turn() {
    power = !power;
  }

  void speed(int speed) {
    this.speed += speed;
  }

  public Car(String name, String brand, int wheelCnt) {
    this.name = name;
    this.brand = brand;
    this.wheelCnt = wheelCnt;
  }

  public Car() {
  }

  public void print() {
    System.out.println("회사 :" + brand);
    System.out.println("차종 :" + name);
  }
}

class kiaCar extends Car {

  public kiaCar(String name, int wheelCnt) {
    super(name, "기아", wheelCnt);
    // brand = "기아";
    // this.name = name;
    // this.wheelCnt = wheelCnt;
  }
}

class hyunCar extends Car {

  public hyunCar(String name, int wheelCnt) {
    // brand = "현대";
    // this.name = name;
    // this.wheelCnt = wheelCnt;
    super(name, "현대", wheelCnt);
  }
}
