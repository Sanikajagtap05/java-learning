public class Code15 {
    public static void main(String[] args) {
        //practing array 2D array
         int marks[][] ={
            {10,20,30},{40,50,60},{70,80,90}
         };
         System.out.println(marks.length);//print the rows in that 2D array
         System.out.println(marks[1][2]);//element at the 1st row and 2nd column
         System.out.println(marks[2].length);//print the colunms in that  array row 
         
         // printing the whole 2D array

         for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+ " ");
            }
            System.out.println();
         }

         
}
}
