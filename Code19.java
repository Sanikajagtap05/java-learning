//Constructor 
// this is default parameterized constructor
/*class Student{
    int age ;
    String name;
}
public class Code19 {
    
    public static void main(String[]args){
      Student s1 = new Student ();
      s1.age =21;
      s1.name = "sanika";

      System.out.println("Name: "+s1.name);
      System.out.println("Age: "+s1.age);
    }
    
}*/

// this is non parametrized constructor
/*class Student {
    int age;
    String name;

    // constructor
    Student() {
        age = 21;
        name = "sanika";
    }
}

class Code19 {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println("Name :" + s1.name);
        System.out.println("Age: " + s1.age);
    }
}*/

// this is parameterized constructor
class Student {
    int age;
    String name;

Student(int a,String n){
    age = a;
    name = n;
}
}

public class Code19{
    public static void main(String args[]){
        Student s1 =new Student(21,"sanika");
        Student s2 = new Student(21,"Vaishnavi");
        System.out.println("Name : " +s1.name+" Age: "+s1.age);
        System.out.println("Name : " +s2.name+" Age: "+s2.age);
    }
}