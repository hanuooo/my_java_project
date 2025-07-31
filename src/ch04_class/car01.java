package ch04_class;

public class car01 {

    String name;
    String color;
    double price;
    int output;
    double height;
    double width;
    double zero100;



    String showzero100Info() {
        double zero = zero100;
        String zeroo = "";
        if(zero >= 3.4){

            zeroo = "느림";
        }else if(zero >= 3.2) {

            zeroo = "보통";
        }else if(zero>=3.0) {

            zeroo = "빠름";
        }else {

            zeroo = "오류";
        }






        String message = "제로백이 "+zero+"이면 "+ zeroo + "입니다.";
        return message;
    }
        String showGagyuk(int ga) {
        String gagyuk = "";
            if (ga == 1 || ga == 2) {

                gagyuk = "기본";
            }else{

                gagyuk = "고가";
            }
            String message =name + "가격은 "+ gagyuk + "입니다.";
            return message;
        }





    void display(){
        System.out.println(name + " 차량");
        System.out.println("색상 :" +color + "색");
        System.out.println("가격 :" +price + " 억 원 ~ ");
        System.out.println("출력 : 375 ~ " +output+ " kW");
        System.out.println("전고 :" +height+"mm");
        System.out.println("전폭 :" +width+"mm");
        System.out.println("제로백 : 3.0 ~ " + zero100+"km/h");
    }
}
