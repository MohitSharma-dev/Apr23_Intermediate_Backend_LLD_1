package Interfaces;

public class Client {
    public static void main(String[] args) {
        BankAPI bankAPI = new ICICIAPI();
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.checkBalance();
    }
}
