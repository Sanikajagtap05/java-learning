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
/*class Student {
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
}*/
/* 
class Employee{
    String name;
    int age;
    String dept;
    long mobno;
}
public class Code19{
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.name ="Sanika";
        e1.age = 21;
        e1.dept = "CSE";
        e1.mobno = 1234567890;

        System.out.println("Name:"+e1.name);
        System.out.println("Age :"+e1.age);
        System.out.println("Department : " +e1.dept);
        System.out.println("Mobile No : "+e1.mobno);
    }
}
*/
class Employee{
String name;
int age ;
String dept;
Employee(String n ,int a ,String d){
name =n;
age = a;
dept = d;
}
}


public class Code19{
public static void main(String args[]){
Employee e1 = new Employee("Sanika",21,"CSE");
Employee e2 =  new Employee("Riya",22,"IT");
Employee e3 =  new Employee("atharava",21,"CSE");

System.out.println("Name of employee1 - " +e1.name);
System.out.println("Age employee1 - " +e1.age);
System.out.println("Department of employee1 - " +e1.dept);
System.out.println("Name of employee2 - " +e2.name);
System.out.println("Age employee2 - " +e2.age);
System.out.println("Department of employee2 - " +e2.dept);
System.out.println("Name of employee3 - " +e3.name);
System.out.println("Age employee3 -     "+e3.age);
System.out.println("Department of employee3 - " +e3.dept);
}
}



