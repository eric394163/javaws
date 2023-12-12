package ex03;

public class alphabet {
    public static void main(String[] args) {
        char a ='A';

        for (int i=0; i<'Z'+1; i++){
            System.out.println(a);
            a += 1;
            

            if (a=='Z'){
                break;
            }

        }
    }
    
}
