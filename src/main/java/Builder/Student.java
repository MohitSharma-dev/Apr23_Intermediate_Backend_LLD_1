package Builder;

public class Student {
    String name;
    int id;
    int age;
    int gradYear;
    String batch;
    double psp;
    int coins;
//    Student(int id , String name , double psp, int coins){
//        ---
//    }
    Student(Builder builder){
        // do validations

        // validations are done

        this.age = builder.getAge();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder(){
        return new Builder();
    }
}
