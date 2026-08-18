import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        // else if

        // int a = -15;
        // if(a > 0){
        // System.out.println("positive");
        // }
        // else if(a == 0){
        // System.out.println("Zero");
        // }
        // else if( a < 0){
        // System.out.println("Negative");
        // }

        /*
         * int marks;
         * Scanner sc =new Scanner(System.in);
         * System.out.print("Enter the marks : ");
         * marks = sc.nextInt();
         * 
         * if(marks >= 75 && marks <=100){
         * System.out.println("A");
         * }
         * else if(marks >=60 && marks <=74){
         * System.out.println("B");
         * }
         * else if(marks >=50 && marks <= 59){
         * System.out.println("C");
         * }
         * else if(marks >=35 && marks <=49){
         * System.out.println("D");
         * }
         * else{
         * System.out.println("Fail");
         * }
         */

        /*
         * int temp ;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the temprature : ");
         * temp =sc.nextInt();
         * if(temp > 40){
         * System.out.println("Very Hot");
         * }
         * else if(temp > 30){
         * System.out.println("Hot");
         * }
         * else{
         * System.out.println("Cool");
         * }
         */
        /*
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Shopping : ");
        amount = sc.nextInt();
        if (amount > 4000) {
            System.out.println("10% discount");
        } else if (amount > 1000) {
            System.out.println("5% discount");
        } else {
            System.out.println("No discount available");
        }

        */


        int units;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of units burned this month : ");
        units = sc.nextInt();
        if ( units >= 0  && units <= 100){
            System.out.println("amout to be paied is : "+units*5);
        }
        else if(units >= 101 && units <= 200){
            System.out.println("amout to be paied is : "+units*7);
        }
        else if(units >= 201 && units <=300){
            System.out.println("Amount to be paid is :"+units*10);
        } 
        else if(units > 300){
            System.out.println("Amount to be paid is :"+units*15);
        }



    }

}

