package constructors;

public class Student {
    int id;
    int gradYear;
    double psp;

    Exam exam;

    Student(){
        this.id = 1;
//        this.name = "New Student";
        this.gradYear = 2000;
        this.psp = 90.0;
        this.exam = new Exam(25);
    }

    Student(String name, int gradYear){
//        System.out.println(this.name);
//        this.name = name;
        this.gradYear = gradYear;
        this.exam = new Exam(35);
    }

    Student(Student original){
//        this.name = original.name;
        this.gradYear = original.gradYear;
        this.psp = original.psp;
        this.exam = new Exam(original.exam.exam_id);
    }
}
