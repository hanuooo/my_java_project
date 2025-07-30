package ch2_control_starement;

public class Difference {
    public static void main(String[] args) {
        int sumA=0 , sumB=0;


        for (int i = 1; i <= 50; i++) {
            if(i % 3 ==0){
                sumB+=i;
            }else{
                sumA+=i;
            }

           }
        int diff=sumA-sumB;
        System.out.println("3의 배수의 총합 :"+sumB);
        System.out.println("3의 배수가 아닌 정수의 총합:"+sumA);
        System.out.println("차이:" +diff);
    }
}
