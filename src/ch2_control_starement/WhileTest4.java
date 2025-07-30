package ch2_control_starement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0 ;
        int count = 0 ;
        double avreage = 0.0 ;

        while (true){
            System.out.print("점수 입력 :");
            int grade = scan.nextInt();


            if(grade<-10){ //tntwkrk -10 미만인 경우에 대한 처리
                System.out.println("프로그램을 종료합니다.");
                break;

            }else if(grade<0){ // - 10 이상의 음수에 대한 처리
                    grade= -grade;

            }else {

            }
            total +=grade;
            count++;
        }
        System.out.println("총 시험 빈도(회수) : " + count);
        System.out.println("총점 :" + total);
        avreage = (double) total / count;
        System.out.println("평균 :" +avreage);
    }
}
