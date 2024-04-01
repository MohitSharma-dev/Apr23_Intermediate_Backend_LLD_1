package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Long , ParkingLot> parkingLots = new TreeMap<>();
    public ParkingLot findParkingLotByGate(Gate gate){
        for(ParkingLot parkingLot : parkingLots.values()){
            if(parkingLot.getGates().contains(gate)){
                return parkingLot;
            }
        }
        return null;
    }
}
