package ch04_class;

public class carMain01 {
    public static void main(String[] args) {

    car01 porsche;
    porsche = new car01();

    porsche.name = "포르쉐";
    porsche.color = "빨간";
    porsche.price = 2.4 ;
    porsche.output = 398;
    porsche.height = 1279.0;
    porsche.width = 1862.0;
    porsche.zero100 = 3.1;



        String message = porsche.showGagyuk(3);
        System.out.println(message);



        message = porsche.showzero100Info();
        System.out.println(message);




        porsche.display();
    }

}
