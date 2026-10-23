// 
// Atucal Encapslation
/*(class Human{
    private  int age = 21;
    private String name =  "Sanika ";

    public int getAge(){
        return age;

    }
    public String getName(){
        return name;
    }
}
public class Code20{
    public static void main(String args [ ]){
        Human h1 = new Human();

        System.out.println(" Name & Age  : " + h1.getName() + " : " +h1.getAge());

    }
}*/

//here i dont want to give fixed name and ag ethen i=we will do this 
/* 
class Human{
    private int age ;
    private String name;

    public int getAge() {
        return age;
    }

    public String  getName(){
        return name;

    }
    public  void setAge(int a){
        age =a;
    }
   
    public void setName(String n){
        name = n;
    }
}
public class Code20{
    public static void main(String args[]){
        Human h1 =  new Human();

        h1.setAge(30);
        h1.setName("Sanika");

        System.out.println("Name : " +h1.getName());
        System.out.println("Age : " +h1.getAge());

    }
}
    
*/

//taking input from user 

import java.util.Scanner;

class Human{
    private int age ;
    private String name;    

    public int getAge(){
        return age;
    }
    public String getName(){
        return name ;

    }
    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }
}
public class Code20{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Human h1 =  new Human();

        System.out.println("Enter your name : ");
        String name =  sc.nextLine();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        h1.setName(name);
        h1.setAge(age);
        System.out.println("Name : "  +h1.getName());
        System.out.println("Age : "  +h1.getAge());


    }
}
