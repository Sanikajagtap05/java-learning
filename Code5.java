public class Code5 {
    public static void main(String[] args) {

        // Unary Opretors

        // int a=10 ;
        // System.out.println(a++);//First read and then increment output 10
        // System.out.println(a);//11 here it will print incremented output

        // int a=10;
        // System.out.println(++a);
        // // System.out.println(a);

        // int b=5;
        // // System.out.println(b++ +2);
        // System.out.println(++b +2);

        // int a = 7;
        // System.out.println(++a + a++);

        // int a = 10;
        // System.out.println(++a + a++);//11 --> now a value 11 therefore 11+11

        // System.out.println(a);//12

        // int a = 10;

        // System.out.println(a-- + --a);

        // int a = 5;

        // System.out.println(a++ + ++a + a++);

        // int a = 8;

        // System.out.println(--a + a-- + ++a);

        // int a = 10;

        // int b = a++;

        // System.out.println(a);
        // System.out.println(b);

        // int a = 10;

        // int b = ++a;

        // System.out.println(a);
        // System.out.println(b);

        int a = 5;

        int b = ++a + a++ + --a + a--;

        System.out.println(a);
        System.out.println(b);

        int x = 3;

        int y = x++ + ++x + x-- + --x;

        System.out.println(x);
        System.out.println(y);

    }

}