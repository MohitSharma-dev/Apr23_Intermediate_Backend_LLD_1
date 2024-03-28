package ParkingLot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private int amount;
    private Operator operator;
    private Gate gate;
    private Token token;
    private List<Payment> payments;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
