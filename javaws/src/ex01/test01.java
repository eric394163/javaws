package ex01;

public class test01 {
    public static void main(String[] args) {
        int korScore = 100, engScore = 50, mathScore = 92 ; 

        int sumScore = korScore + engScore + mathScore ;
        float avgScore = sumScore / 3;

        System.out.println(String.format("평균점수 : %.2f ",avgScore));

    }
    
}
