package ParkingLot.models;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private String number;
    private SlotStatus slotStatus;
    private List<VehicleType> supportedVehicleTypes;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
}
