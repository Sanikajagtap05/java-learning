import java.net.SocketPermission;

public class Code3 {
    public static void main(String[] args) {
        // type Casting and type conversion

        // int a =15;
        // byte b =a;
        // System.out.println(b);

        // this conversion is not possible because here ei are trying to store int value
        // of a into datatype byte b which has less range than int so we need to do type
        // casting here.

        // short a =100;
        // long b = a;
        // System.out.println(b);

        // this worded because gere we are trig to store the value of short a int long b

        // int a =50;
        // double b=a;
        // System.out.println(b);

        // this conversion converted the int value in double thus output is 50.0

        // char c ='A';
        // int a =c;
        // System.out.println(a);

        // in computer character are not stored as letters . They are stored as numbers
        // using ASCII value thus 'A' ACSSI value is 65 .Thus here we are trying to
        // convert char to int java automatically converts the char into its integers
        // value .SO

        // Type Casting
        // double a = 25.99;
        // int b=(int)a;
        // System.out.println(b);

        // here we manual converted the double value in int type thus output will be the
        // 25 only

        // float a =127.25f;
        // int b=(int)a;
        // System.out.println(b);

        // int a=129;
        // byte b=(byte)a;
        // System.out.println(b);

        // Since the byte range -128 to 127 the 129 is out of the range ,so java cannot
        // store it directly, 129 % 256 = 129;
        // 129-256=-127;
        // b=-127;

        // int a = 277;
        // byte b =(byte)a;
        // System.out.println(b);

        // Tricky Questions
        // byte a =100;
        // byte b =27;

        // int c = a + b;

        // System.out.println(c);

        // Whenever you perform arithmetic on byte, short, or char, the result is always
        // an int.

        // byte a =100;
        // byte b =29;

        // byte c = (byte)(a+b);

        // System.out.println(c);

        // -127

        // int a =300;
        // byte b=(byte)a;

        // // System.out.println(b);

        // char ch = 'Z';
        // int a = ch;

        // System.out.println(a);

        // int a = 130;
        // byte b = (byte) a;

        // System.out.println(b);

        // int a = -130;
        // byte b = (byte) a;

        // System.out.println(b);

        // char ch = 97;
        // System.out.println(ch);

        int a = 'a';
        System.out.println(a);
    }
}
