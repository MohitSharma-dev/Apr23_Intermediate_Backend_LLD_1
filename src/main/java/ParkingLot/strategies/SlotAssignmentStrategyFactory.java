package ParkingLot.strategies;

import ParkingLot.models.SlotAssignmentStrategyType;
import ParkingLot.repositories.ParkingLotRepository;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategyByType(SlotAssignmentStrategyType slotAssignmentStrategyType){
        return new RandomSlotAssignmentStrategy();
    }
}
