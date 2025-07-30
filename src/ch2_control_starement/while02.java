package ch2_control_starement;

public class while02 {
    public static void main(String[] args) {
        int i = 1 ;
        int odd = 0 ;
        int even = 0 ;

        while (i < 11){

            if (i % 2 == 0){
                even +=i;
            }else{
                odd +=i;
            }

            i++;

        }
        System.out.println("홀수의 총합 :" + odd);
        System.out.println("짝수의 총합 :" + even);
    }
}