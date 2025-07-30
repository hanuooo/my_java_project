package ch2_control_starement;

public class For05 {
    public static void main(String[] args) {

       int su01 = 0;
       int su02 = 0;

        for (int i = 1; i <=10 ; i++) {
            if (i%3==0||i%5==0){
                su01 +=i;

            }else {
                su02 +=i;

            }
        }
        System.out.println(su01);
        System.out.println(su02);
    }
}
