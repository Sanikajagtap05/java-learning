class Student {
    int rollno;
    String name;
    int marks;
}

public class Code18 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sanika";
        s1.rollno = 2;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "jfkdsnd";
        s2.rollno = 6;
        s2.marks = 58;

        Student stud[] = new Student[2];
        stud[0] = s1;
        stud[1] = s2;

        for(Student s : stud){
            System.out.println("Name: " + s.name +":" + s.marks);
        }
    }
}
