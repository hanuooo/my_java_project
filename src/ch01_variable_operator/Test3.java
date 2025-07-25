package ch01_variable_operator;

public class Test3 {
    public static void main(String[] args) {
        double radius,PI,area;

        radius = 10.0;
        PI = 3.14;
        area = PI*radius*radius;

        System.out.print("반지름이 "+radius+" 일 때 ");
        System.out.println(" 원의 면적은 " + area + " 입니다.");
        System.out.println();
        System.out.println("단,원주율은 " + PI + " 로 하도록 합니다.");
    }
}
