package Builder;

public class Client {
    public static void main(String[] args) {
//        Builder b = new Builder();
//        Builder b = Student.getBuilder();
////        b.setAge(25);
////        b.setGradYear(2020);
////        b.setName("Mohit");

        Student s = Student.getBuilder()
                .setAge(25)
                .setGradYear(2020)
                .setName("Mohit")
                .build();




//        Student s = new Student(b);
//        Student s = b.build();

        // setters will be used once the obj has been created

    }
}
