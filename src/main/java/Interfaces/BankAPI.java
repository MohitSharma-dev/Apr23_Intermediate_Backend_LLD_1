package Interfaces;

public interface BankAPI {
    int getBalance(int accNumber);

    void transferMoney(int from, int to, int amount);
}
