package ch3_array;

public class Array01 {
    public static void main(String[] args) {

    String[] bts = new String[7];

    bts[0] = "진";
    bts[1] = "뷔";
    bts[2] = "정국";
    bts[3] = "RM";
    bts[4] = "지민";
    bts[5] = "슈가";
    bts[6] = "제이홉";

        System.out.println("배열 요소 출력하기");

        for (int i = 0; i <bts.length; i++) {
            System.out.println((i+1) + "번째 맴버  " + bts[+i]);
        }

        for (int i = 0; i <bts.length; i++) {
            if(i!= bts.length-1 ){
                System.out.print(bts[i] + ", ");

            }else{
                System.out.print(bts[i]);
            }
        }
        System.out.println();
    }
}
