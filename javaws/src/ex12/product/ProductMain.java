package ex12.product;

import java.util.Scanner;

public class ProductMain {

    static Scanner sc = new Scanner(System.in);

    static Product[] list = new Product[30];
    static int cnt = 0;

    public static void main(String[] args) {

        int menu;
        do {
            printMenu();

            menu = sc.nextInt();

            runMenu(menu);
        } while (menu != 3);

        sc.close();
    }

    private static void runMenu(int menu) {
        switch (menu) {
            case 1:
                insertProduct();
                break;
            case 2:
                printProduct();
                break;
            case 3:
                System.out.println("프로그램 종료");

                break;

            default:
                System.out.println("잘못된메뉴");
                break;
        }
    }

    private static void printProduct() {
        if (cnt == 0) {
            System.out.println("등록된 제품 없음");
            return;
        }
        for (int i = 0; i < cnt; i++) {
            list[i].print();
        }
    }

    private static void insertProduct() {

        printProductTitle();

        int select = sc.nextInt();
        System.out.print("브랜드 :");
        sc.nextLine();
        String brand = sc.nextLine();
        System.out.print("제품명 :");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("제품코드 :");
        sc.nextLine();
        String code = sc.next();

        switch (select) {
            case 1:
                System.out.print("화면 크기 ");
                int size = sc.nextInt();
                list[cnt++] = new TV(brand, code, title, size);

                break;
            case 2:
                System.out.print("냉방면적 ");
                double area = sc.nextDouble();

                break;
            case 3:
                System.out.print("CPU ");
                int cpu = sc.nextInt();
                System.out.print("램 ");
                int ram = sc.nextInt();
                break;

            default:
                System.out.println("잘못된 제품");
                break;
        }
        System.out.println("등록이 완료됐습니다");
    }

    private static void printProductTitle() {
        System.out.println("================");
        System.out.println("제품목록");
        System.out.println("TV");
        System.out.println("에어컨");
        System.out.println("컴");
        System.out.print("제품 선택 :");
    }

    private static void printMenu() {
        System.out.println("================");
        System.out.println("메뉴");
        System.out.println("제품추가");
        System.out.println("제품확인");
        System.out.println("종료");
        System.out.println("================");
    }

}
