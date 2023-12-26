package ex12;

public class Polymorphism2 {

    public static void main(String[] args) {
        // 포함 다형성
        // 자식 인스턴스들을 부모 인스턴스가 관리하는 것

        Rect[] rects = new Rect[10];
        Ellipse[] ellipses = new Ellipse[10];
        Line[] lines = new Line[10];
        int restCnt = 0, ellipseCnt = 0, lineCnt = 0;

        rects[restCnt++] = new Rect();
        ellipses[ellipseCnt++] = new Ellipse();
        lines[lineCnt++] = new Line();
        lines[lineCnt++] = new Line();
        rects[restCnt++] = new Rect();

        Shape[] shapes = new Shape[30];

        int cnt = 0;

        shapes[cnt++] = new Rect();
        shapes[cnt++] = new Ellipse();
        shapes[cnt++] = new Line();
        shapes[cnt++] = new Line();
        shapes[cnt++] = new Rect();

        for (int i = 0; i < cnt; i++) {
            shapes[i].draw();
        }

    }

}

class Shape {
    void draw() {

    }
}

class Rect extends Shape {
    void draw() {
        System.out.println("사각형");
    }
}

class Ellipse extends Shape {
    void draw() {
        System.out.println("타원");
    }
}

class Line extends Shape {
    void draw() {
        System.out.println("선");
    }
}