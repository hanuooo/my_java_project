package ch2_control_starement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i < 11; i++) {
            total += i;
        }

        System.out.println("총합01 :" + total);

        total = 0;

        for (int i = 97; i > 1; i -= 5) {
            total += i;
        }

        System.out.println("총합02 :" + total);

        total = 0;
        for (int i = 1; i < 101; i++) {
            total += i;
        }
        System.out.println("총합 03 :"+ total);



    
    
    }
    
    

}

