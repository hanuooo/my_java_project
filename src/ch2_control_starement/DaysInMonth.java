package ch2_control_starement;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 2 ;
        int last_day = 0;

        switch (month){
            case 1: case 3: case 5: case 7: case 8 : case 10: case 12:
            last_day = 31;
                break;

            case 4: case 6: case 9: case 11:
                last_day = 30;
                    break;

            case 2:
                last_day = 28;
                break;

            default:
                System.out.println("올바르지 않은 날짜입니다.");
                System.exit(0);

        }
            String message = "%d월의 마지막 날은 %d일 입니다.";
            System.out.printf(message , month , last_day);

    }





}
