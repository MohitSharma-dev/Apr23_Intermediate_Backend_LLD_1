package ParkingLot.models;

import java.util.Date;

public class Payment extends BaseModel{
    private int amount;
    private PaymentMode mode;
    private int refNumber;
    private Date date;
    private PaymentStatus paymentStatus;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
