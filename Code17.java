class Student {
    int rollno;
    String name;
    int marks;
}

public class Code17 {
    public static void main(String args[]) {

        // Array of objects

        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Sanika";
        s2.rollno = 102;
        s2.marks = 94;

        Student s3 = new Student();
        s3.name = "Shruti";
        s3.rollno = 103;
        s3.marks = 95;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                students[i].rollno + " " +
                students[i].name + " " +
                "-" + " " +
                students[i].marks
            );
        }
    }
}