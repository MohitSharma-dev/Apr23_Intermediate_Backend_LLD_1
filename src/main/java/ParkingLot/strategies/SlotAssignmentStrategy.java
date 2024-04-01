package ParkingLot.strategies;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot getSlot( ParkingLot parkingLot, VehicleType vehicleType);
}
