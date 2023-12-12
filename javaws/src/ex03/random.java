package ex03;

public class random {

    public static void main(String[] args) {
        
        //min이상 max 이하 랜덤 숫자 만드는 방법 
        
        int min =1, max = 10;

        int r = (int)(Math.random()*(max-min+1)+min);
        System.out.println(r);
    }
    
}
