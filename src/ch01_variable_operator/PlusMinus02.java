package ch01_variable_operator;

public interface PlusMinus02 {
    public static void main(String[] args) {
        int x =3 , y = 5 , z;

        z = x++ + --y ;

        System.out.println("x :"+ x); // 4
        System.out.println("y :"+ y); // 4
        System.out.println("z :"+ z); // 7

        z += --x + y++;
        // z = z + --y + y++ ;

        System.out.println("x :"+ x); // 3
        System.out.println("y :"+ y); // 5
        System.out.println("z :"+ z); // 14

        z += x-- + --y;
        System.out.println("x :"+x); //
        System.out.println("y :"+y); // 4
        System.out.println("z :"+z); // 21

        z -= ++x + y--;
        System.out.println("x :"+x); //3
        System.out.println("y :"+y); //3
        System.out.println("z :"+z); // 21 - 3 - 4 = 14

        z *= --x + y--;
        System.out.println("x :"+x); //2
        System.out.println("y :"+y); //2
        System.out.println("z :"+z); // 14 * 5 = 70

    }
}
