package Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student apr23Student = new Student();
        apr23Student.name = "Temp";
        apr23Student.psp = 100.0;

        studentRegistry.register("Apr23Student" , apr23Student);

        IntelligentStudent apr23IntelligentStudent = new IntelligentStudent();
        apr23IntelligentStudent.name = "Temp";
        apr23IntelligentStudent.psp = 100.0;
        apr23IntelligentStudent.iq = 90;

        studentRegistry.register("Apr23IntelligentStudent" , apr23IntelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        Student s = new Student();
        s.psp = 12.0;
        s.name = "Mohit";
        Student s1 = s.copy();

        Student s2 = studentRegistry.get("Apr23Student");
        Student s3 = studentRegistry.get("Apr23IntelligentStudent");
        System.out.println("Hi!");
    }
}
