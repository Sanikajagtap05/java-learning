import java.util.Scanner;

public class Code10 {

    // loops
    // while loop pratice questions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * int i =1;
         * while (i <=10){
         * System.out.println(i);
         * i++;
         * }
         * 
         */
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int num;
         * 
         * System.out.println("Enter the no -");
         * num = sc.nextInt();
         * 
         * System.out.println("You entered: " + num);
         * 
         * while (num <= 100){
         * System.out.println(num);
         * num++;
         * 
         * }
         * 
         */

        /*
         * int num;
         * System.out.println("Enter the no -");
         * num = sc.nextInt();
         * 
         * while (num <= 20){
         * if (num % 2 == 1) {
         * System.out.println(num);
         * }
         * num++;
         * }
         */
        /*
         * int num;
         * System.out.println("Enter the no -");
         * num =sc.nextInt();
         * 
         * while(num <= 20){
         * if(num % 2 == 0){
         * System.out.println(num);
         * 
         * }
         * num++;
         * 
         * }
         */

        /*
         * int num ;
         * System.out.println("Enter the no of which you require multiplication - ");
         * num =sc.nextInt();
         * int i= 1;
         * while(i<= 10){
         * System.out.println(num + "x" +i+ "=" +(num*i));
         * i++;
         * }
         * 
         */

        /*
         * int num;
         * System.out.println("Enter the no  - ");
         * num =sc.nextInt();
         * int i = 1;
         * 
         * int sum =0;
         * while( i<= num){
         * sum = sum+i;
         * i++;
         * 
         * }
         * System.out.println("Sum = " +sum);
         */

        /*
         * System.out.println("Enter the no  - ");
         * int n = sc.nextInt();
         * 
         * int sum = 0;
         * int i =1;
         * while(i<=n){
         * sum = sum +i;
         * i++;
         * 
         * 
         * }
         * System.out.println("Sum = "+sum);
         */

        /*
         * int sum = 0;
         * System.out.println("Enter the no - ");
         * int n= sc.nextInt();
         * int i = 1;
         * while(i<=n){
         * sum = sum +i;
         * i++;
         * }
         * System.out.println("Sum = "+sum);
         * 
         */
        /*
         * int count = 0;
         * 
         * System.out.println("Enter the no - ");
         * int num = sc.nextInt();
         * while(num >0){
         * num = num/10;
         * count++;
         * }
         * System.out.println("Count = "+count);
         */

        /*
         * int count = 0;
         * System.out.println("Enter the no - ");
         * int n =sc.nextInt();
         * while(n>0){
         * n =n/10;
         * count++;
         * }
         * System.out.println( "Count = "+count);
         */

        /*
        int count =0;
        System.out.println("Enter the no - ");
        int n =sc.nextInt();
        while( n>0){
            n=n/10;
            count++;

        }
        System.out.println("count - "+count);
         */

         /* 
        System.out.println("Enter the no - ");
        int n = sc.nextInt();
        int reverse=0;

        while(n>0){
            int digit= n % 10;
            reverse = reverse *10 +digit;
            n = n / 10;
        }
        System.out.println("Reverse = "+reverse);
        */
        /* 
        int reverse = 0;
        System.out.println("Enter the no - ");
        int n = sc.nextInt();
        while(n>0){
             int digit = n% 10;
             reverse = reverse *10 + digit;
             n = n/10;

        }
        System.out.println("Revers - "+reverse);
        */

         /* 
        int reverse =0;
        System.out.println("Enter the no - ");
        int n =sc.nextInt();
        while(n>0){
            int digit =n%10;
            reverse = reverse * 10 +digit;
            n =n/10;
        }
        System.out.println("Reverse  - "+reverse);
*/

int reverse =0;
System.out.println("enter the no - ");
int n =sc.nextInt();
while(n>0){
    int num = n%10;
    reverse =reverse *10+num;
    n = n/10;
}
System.out.println(+reverse);

    }

}
