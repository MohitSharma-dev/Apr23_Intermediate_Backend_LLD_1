package Builder;

public class Client {
    public static void main(String[] args) {
//        Builder b = new Builder();
        Builder b = Student.getBuilder();
        b.setAge(25);
        b.setGradYear(2020);
        b.setName("Mohit");


        Student s = new Student(b);

    }
}
