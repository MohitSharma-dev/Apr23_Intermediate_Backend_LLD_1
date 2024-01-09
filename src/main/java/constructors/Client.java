package constructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("Mohit", 2000);
        Student s2 = new Student(s1);
        System.out.println(s1.exam.exam_id);
        s2.exam.exam_id = 49;
        System.out.println(s1.exam.exam_id);
        // Below thing will not create a separate copy
        //        Student s3 = s2;
        //        s3.name = "Aniket";
        System.out.println(s.psp);
    }
}

// Default constructor comes from "Object" class