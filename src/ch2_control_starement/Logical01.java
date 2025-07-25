package ch2_control_starement;

public class Logical01 {
    public static void main(String[] args) {
        int month = 7 ;
        String  season ;

        if(month>=3 && month <=5) {

            System.out.println(season = "봄");
        }else if (month>=6 && month <=8){

            System.out.println(season = "여름");
        }else if (month>=9 && month <=11){

            System.out.println(season = "가을");
        }else{

            System.out.println(season = "겨울");

        }
        System.out.println(month + "월은 "+ season + "입니다.");
    }
}
