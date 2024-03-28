package ParkingLot.models;

public class Gate extends BaseModel{
    private GateType gateType;
    private Operator operator;
    private int gateNumber;
    private GateStatus gatestatus;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getGatestatus() {
        return gatestatus;
    }

    public void setGatestatus(GateStatus gatestatus) {
        this.gatestatus = gatestatus;
    }
}
