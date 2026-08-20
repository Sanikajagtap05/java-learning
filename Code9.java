import java.util.Scanner;

public class Code9 {
    // Switch case practice questions
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * int num;
         * 
         * System.out.print("Enter the no: ");
         * num = sc.nextInt();
         * 
         * switch (num) {
         * 
         * case 1:
         * System.out.println("Monday");
         * break;
         * 
         * case 2:
         * System.out.println("Tuesday");
         * break;
         * 
         * case 3:
         * System.out.println("Wednesday");
         * break;
         * 
         * case 4:
         * System.out.println("Thursday");
         * break;
         * 
         * case 5:
         * System.out.println("Friday");
         * break;
         * 
         * case 6:
         * System.out.println("Saturday");
         * break;
         * 
         * case 7:
         * System.out.println("Sunday");
         * break;
         * 
         * default:
         * System.out.println("Invalid Input");
         * }
         * 
         */

        /* 
        int a, b;
        System.out.println("Enter the value of a - " );
        a = sc.nextInt();
        System.out.println("Enter the value of b - " );
        b = sc.nextInt();

        int num;
        System.out.println("Enter your choice  : " );
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Addition  : " + (a + b));
                break;

            case 2:
                System.out.println("Substraction - "+(a - b));
                break;

            case 3:
                System.out.println("Multiplication " + (a * b));
                break;
            case 4:
                System.out.println("Division :" + (a % b));
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

        */
   
        /*
        System.out.println( "------- MENU --------");
        System.out.println("1.Pizza");
        System.out.println("2.Burger");
        System.out.println("3.Sandwich");
        System.out.println("4.Pasta");

        int choice ;
        System.out.println("Enter your choice please : ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your Pizaa is on the way ... ");
                System.out.println("Thank you!!!");
                break;
            case 2:
                System.out.println("Your Burger is on the way ... ");
                System.out.println("Thank you!!!");
                break;
               case 3:
                System.out.println("Your Sandwich is on the way ... ");
                System.out.println("Thank you!!!");
                break;
               case 4:
                System.out.println("Your Pasta is on the way ... ");
                System.out.println("Thank you!!!");
                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
        }
 */


        int num;
        System.out.println("Enter the no - ");
        num = sc.nextInt();

        System.out.println("Traffic Signal ");
        System.out.println("1.Red ");
        System.out.println("2.Orange ");
        System.out.println("3.Green ");

        switch (num) {
            case 1:
                System.out.println("Wait until the single turns green ");
                break;
            case 2:
                System.out.println("Be ready single is about to turn green  ");
                break;
            case 3:
                System.out.println("Go... ");
                break;
            
            default:
                System.out.println("INVALID INPUT !!! TRY AGAIN");
                break;
        }
        



    }
}
