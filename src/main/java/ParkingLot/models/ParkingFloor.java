package ParkingLot.models;

import java.util.List;
import java.util.Vector;

public class ParkingFloor extends BaseModel{
    private String number;
    private List<ParkingSlot> parkingSlots;
    private List<VehicleType> vehicleTypes;
    private FloorStatus floorStatus;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
