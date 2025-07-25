package ch01_variable_operator;

public class Test6 {
    public static void main(String[] args) {
        int Time = 4000;
        int second;
        int minute;
        int hour;

        hour = Time / 3600;
        minute = (Time - hour*3600)/60;
        second = Time % 60;

        System.out.print(Time+"초는 ");
        System.out.print(hour+"시간, ");
        System.out.print(minute+"분, ");
        System.out.println(second+"초입니다.");


    }
}
