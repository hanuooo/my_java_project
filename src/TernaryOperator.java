public class TernaryOperator {
    public static void main(String[] args) {

        int a = 3, b = 5;
        int result = a >= b ? a - b : b - a;


        System.out.println("절대 값:" + result);


        int x = 10;

        result = x % 2 == 0 ? x + 3 : x * x;

        System.out.println("결과:" + result);

        x = 8;
        int y = 4;

        result = x >= y ? x : y;

        System.out.println("큰 수 :" + result);

        result = x != y ? y : x;

        System.out.println("작은 수 :" + result);

        x = 6;
        y = 12;


        String str = y % x ==0 ? "yes" : "no";

        System.out.println("결과 :" + str);

        String message;
        int su = 7;


        String msg = su % 2 == 0 ? "짝수": "홀수";

        System.out.println("숫자"+ su + "은(는) " +msg+"입니다.");

        int score = 85 ;


        String sco=  score>=60 ? "합격": "불합격";
        message = (score+"점이므로 "+sco+"입니다.");
        System.out.println(message);


        String jumsu;
        int aaa =81 ;

        String Jum = aaa>=80 ? "합격":"불합격";
        jumsu = (aaa+"점이므로 "+Jum+"입니다.");
        System.out.println(jumsu);




    }
}
