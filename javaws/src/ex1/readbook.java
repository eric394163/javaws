package ex1;

public class readbook {

    public static void main(String[] args) {
        book book = new book();

        book.name="책";
        book.page=10;

        System.out.println("책 이름 :"+book.name+"페이지 :"+book.page);

        book.Read();
    }
    
}
