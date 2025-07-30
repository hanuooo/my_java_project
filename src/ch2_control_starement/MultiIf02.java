package ch2_control_starement;

public class MultiIf02 {
    public static void main(String[] args) {

        int age = 70;
        double ticket = 1000.0 ;
        double discount ; // 할인율

        String person;

        if(age < 8){
        discount = 1.0;
        person = "유아(무료 입장)";
        }else if(age<14){
         discount = 0.5;
         person = "어린이(50% 할인)";
        }else if(age<20){
            discount = 0.3;
            person = "청소년(30% 할인)";
        }else if(age>=65){
            discount = 0.4;
            person = "노인(40% 할인)";
        }else{
            discount = 0;
            person = "성인(정가)";
        }
        String message = age + "살 :" + person;
        System.out.println(message);
        message = "가격은 "+ (int)(ticket*(1- discount)) + "원 입니다.";
        System.out.println(message);
    }
}
