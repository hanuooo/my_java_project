package ch2_control_starement;

public class AdultCheckfinsh {
    public static void main(String[] args) {

        String name = "홍길동";
        int age = 12;
        int _gender = 3; // 주민 번호 뒷자리 생일
        String gender;// 성별(한글)
        String adult; // 미성년자 여부 문자열

        if (age >= 19) {
            adult = "성인";


        } else {
            adult = "미성년자";

        }

        if (_gender == 1 || _gender == 3) {
            gender = "남자";
        } else {
            gender = "여자";
        }
        String message;
            message = "이름 :" + name + "님 ,나이 :" + age + "세 , 성인 체크 :" + adult + ", 성별 :" + gender;
        System.out.println(message);

    }
}
