import java.util.Scanner;

public class Code16 {
    public static void main(String []args){
        // jagged array 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows : ");
        int rows = sc.nextInt();    
      
         int arr [][] = new int[rows][];
         for(int i=0;i<rows;i++){
            System.out.println("Enter the no of columns for row " + i + " : ");
            int col = sc.nextInt();
            arr[i] = new int[col];
         }
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

            System.out.println("The elements of the array are : ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        
    }
    
}
