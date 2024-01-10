package Polymorphism;

public class Client {
    public static void changePassword(User x, String new_pass){
        x.password = new_pass;
//        x.psp = 30.0;
    }
    public static void main(String[] args) {
        User x = new User();
        Student y = new Student();
        TA z = new TA();

        User temp = y;
        temp.password = "abc";
//        temp.psp = 30.0;
        y.psp = 30.0;
//        temp = z;
        changePassword(x, "password");
        changePassword(y, "password");
        changePassword(z, "password");


    }
}
