package ParkingLot.models;

import java.util.Date;

public class Token extends BaseModel{
    private String number;
    private Date entryTime;
    private Gate generatedAt;
    private Operator generatedBy;
    private Vehicle vehicle;
    private ParkingSlot assignedSlot;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getAssignedSlot() {
        return assignedSlot;
    }

    public void setAssignedSlot(ParkingSlot assignedSlot) {
        this.assignedSlot = assignedSlot;
    }
}
