package Adapter;

import java.util.List;

public class ICICIBankAPIAdapter implements BankAPI{
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return iciciBankAPI.findBalance();
    }

    @Override
    public void moneyTransfer() {
        iciciBankAPI.fundTransfer();
    }

}
