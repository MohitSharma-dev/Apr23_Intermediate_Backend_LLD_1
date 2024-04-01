package ParkingLot.strategies;

import ParkingLot.models.*;
import ParkingLot.repositories.ParkingLotRepository;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{

    @Override
    public ParkingSlot getSlot(ParkingLot parkingLot, VehicleType vehicleType) {

        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
                if(parkingSlot.getSupportedVehicleTypes().contains(vehicleType) &&
                parkingSlot.getSlotStatus().equals(SlotStatus.EMPTY)){
                    return parkingSlot;
                }
            }
        }

        return null;
    }
}
