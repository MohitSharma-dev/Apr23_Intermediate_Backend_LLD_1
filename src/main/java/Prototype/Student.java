package Prototype;

public class Student implements Prototype<Student>{
    int id;
    String name;
    double psp;

    Student(){

    }
    Student(Student other){
        this.name = other.name;
        this.psp = other.psp;
        this.id = other.id;
    }

    public Student copy() {
        Student s = new Student(this);
        return s;
    }
}
