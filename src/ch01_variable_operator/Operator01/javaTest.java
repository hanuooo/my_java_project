package Operator01;

public class javaTest {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 8 ;

        boolean bool1 = a != b ; // 10 != 8 = ture
        boolean bool2 = --a == b++ ; //  9 == 8 = false
        boolean bool3 = a++ != --b ;  // 9 != 8 = ture
        boolean bool4 = bool3 && (5>7) ; // (10 != 8 ) ture && ( 5 > 7 ) false = false
        boolean bool5 = !bool4 || ( bool1 && bool2 ) ; // !(false) || ( 10 !=8 && 9==8 false)
                                                        // ture || flase
                                                        // ture

        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);
    }
}
