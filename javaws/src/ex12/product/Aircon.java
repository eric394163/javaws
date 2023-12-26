package ex12.product;

public class Aircon extends Product {

    int Area;

    public Aircon(String brand, String code, String name, int area) {
        super(brand, code, name);
        Area = area;
    }

    @Override
    public void print() {

    }

}
