// 
// Atucal Encapslation
class Human{
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
}