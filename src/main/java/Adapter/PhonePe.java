package Adapter;

public class PhonePe {
//    YesBankAPI yesBankAPI;
    BankAPI bankAPI;
    PhonePe(YesBankAPI yesBankAPI){
//        this.yesBankAPI = yesBankAPI;
    }

    PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
    }
}
