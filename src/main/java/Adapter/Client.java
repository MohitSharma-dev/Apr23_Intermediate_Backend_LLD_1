package Adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAPI());

        BankAPI b = new YesBankAPIAdapter();
        PhonePe phonePe1 = new PhonePe(b);
    }
}
