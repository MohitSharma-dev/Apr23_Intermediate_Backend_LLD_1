package Interfaces;

public class PhonePe {
    BankAPI bankAPI;

    PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
    }

    public int checkBalance(){
        return bankAPI.getBalance(20);
    }
}
