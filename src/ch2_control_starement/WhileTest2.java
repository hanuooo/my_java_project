package ch2_control_starement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        // 스캐너 장치 준비
        Scanner scan = new Scanner(System.in);
        int total = 0 ; // 총점
        int count = 0 ; // 시행 횟수
        double avreage = 0.0 ; // 평균

        while (true) {
            System.out.print("점수 입력 :");
            int grade = scan.nextInt();
            //System.out.println("숫자 :" + grade);

            if (grade<=0){
                System.out.println("음수 또는 0이어서 종료합니다.");
                break;
            }

            //양수가 아닌 경우 계산을 하면 안됩니다.
            total +=grade ;
            count++;
        }
        System.out.println("총점 :"+total);
        avreage = (double) total / count;
        System.out.println("평균 :" + avreage);
    }

}
