package TernaryOperator;

public class java2 {
    public static void main(String[] args) {
    int a = 10 , b = 8;


    boolean bool1 = a != b;
    boolean bool2 = --a == b++;
    boolean bool3 = a++ != --b;
    boolean bool4 = (bool1 && bool2);
    boolean bool5 = (!bool2 || (bool3 && bool2));

        System.out.println("bool1:" + bool1);
        System.out.println("bool2:" + bool2);
        System.out.println("bool3:" + bool3);
        System.out.println("bool4:" + bool4);
        System.out.println("bool5:" + bool5);







    }
}
