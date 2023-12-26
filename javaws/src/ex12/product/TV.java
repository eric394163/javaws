package ex12.product;

public class TV extends Product {

    int size;

    public TV(String brand, String code, String name, int size) {
        super(brand, code, name);
        this.size = size;
    }

    @Override
    public void print() {

    }

}
