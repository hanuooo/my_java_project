package ch2_control_starement;

import java.util.Scanner;

public class WhileTest44 {
    public static void main(String[] args) {
        int total = 0 , count = 0;
        double average = 0;

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("점수 입력 :");
            int grade = scan.nextInt();

            if(grade<-10){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (grade < 0) {
                grade=-grade;
            }else {

            }
            count++;
            total +=grade;
            average = (double) total / count;
        }

        System.out.println("총 시험 빈도(회수) :" + count);
        System.out.println("총점 :" + total);
        System.out.println("평균 :" + average);
    }
}
