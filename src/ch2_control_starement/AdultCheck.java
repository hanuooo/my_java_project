package ch2_control_starement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 12;
        int _gender = 3 ; // 주민 번호 뒷자리 생일
        String gender = "성별";// 성별(한글)

        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age +"세");
        if (age >= 19) {

            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }
        if (1==_gender || 3==_gender){

            System.out.println(gender + ":남자");
        } else {

            System.out.println(gender + ":여자");
        }
    }
}
