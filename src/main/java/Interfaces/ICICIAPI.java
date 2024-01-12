package Interfaces;

public class ICICIAPI implements BankAPI{
    @Override
    public int getBalance(int accNumber) {
        return 0;
    }

    @Override
    public void transferMoney(int from, int to, int amount) {
        System.out.println("Money Transferred from ICICI");
    }
}
