package ex08;

public class methodex1 {
    public static void main(String[] args) {
        // 재귀 메서드로 스택 오버플로우 발생
        recursive();

    }

    public static void recursive() {
        System.out.println("재귀 메서드");
        recursive();
        return;
    }

}
