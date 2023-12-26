package ex11;

public class homework1 {

    public static void main(String[] args) {
        Student[] stds = new Student[5];
        stds[0] = new Student(1, 1, 1, "김");
        stds[2] = new Student(1, 1, 2, "성");

        stds[0].insertSubject("국어", 100);
        stds[0].insertSubject("영어", 50);

        stds[0].print();
    }

}
