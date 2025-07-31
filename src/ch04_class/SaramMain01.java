package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        //int x;
        //System.out.println(x);
        // 단계 2 : 객체 생성
        // 클래스이름 객체이름 = new 생성자 이름() ;

        Saram01 yusin = new Saram01();

        Saram01 soon;
        soon = new Saram01();


        // 단계 3 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자 라고 부른다.
        yusin.nationality = "대한 민국";
        yusin.name = "김유신";
        yusin.height = 181.5;
        yusin.weight = 91.0;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        // 단계 4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);




        String message = yusin.showGenderInfo(1);
        System.out.println(message);


        message = yusin.showBmiInfo();
        System.out.println(message);



        yusin.display();

    }
}
