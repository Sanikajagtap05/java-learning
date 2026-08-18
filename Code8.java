import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        //  else if

        //   int a = -15;
        //   if(a > 0){
        //     System.out.println("positive");
        //   }
        //   else if(a == 0){
        //     System.out.println("Zero");
        //   }
        //   else if( a < 0){
        //     System.out.println("Negative");
        //   }

        /*
        int marks;
        Scanner  sc =new Scanner(System.in);
        System.out.print("Enter the marks : ");
        marks = sc.nextInt();

        if(marks >= 75 && marks <=100){
            System.out.println("A");
        }
        else if(marks >=60 && marks <=74){
            System.out.println("B");
        }
        else if(marks >=50 && marks <= 59){
            System.out.println("C");
        }
        else if(marks >=35 && marks <=49){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
         */
      
        int temp ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temprature : ");
        temp =sc.nextInt();
        if(temp > 40){
            System.out.println("Very Hot");
        }
        else if(temp > 30){
            System.out.println("Hot");
        }
        else{
            System.out.println("Cool");
        }










        



    }
    
}
