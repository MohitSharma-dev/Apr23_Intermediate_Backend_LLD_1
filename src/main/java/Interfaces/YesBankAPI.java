package Interfaces;

public class YesBankAPI implements BankAPI{
    @Override
    public int getBalance(int accNumber) {
        return 0;
    }

    @Override
    public void transferMoney(int from, int to, int amount) {
        System.out.println("Money is transfered by Yes bank");
    }
}
