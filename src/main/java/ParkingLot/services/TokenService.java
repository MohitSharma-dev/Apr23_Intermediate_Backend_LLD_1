package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;

    TokenService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository
    ){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
    }
    public Token issueToken(
        Long gateId,
        VehicleType vehicleType,
        String vehicleNumber,
        String ownerName
    ){
        // 1. create a Token
        Token token = new Token();
        token.setEntryTime(new Date());

        // using the gateId, we need the gate object from the database
        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new RuntimeException("Invalid gate is entered!");
        }
        Gate gate = gateOptional.get();
        token.setGeneratedAt(gate);
        token.setGeneratedBy(gate.getOperator());

        // check if the vehicle already exists
        Optional<Vehicle> vehicleOptional =  vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle;
        if(vehicleOptional.isEmpty()){
            // Since this is the new vehicle
            // let's create the obj and save it in the db
            Vehicle vehicle = new Vehicle();
            vehicle.setNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            savedVehicle = vehicleRepository.save(vehicle);
        } else {
            // if the vehicle already exists
            savedVehicle = vehicleOptional.get();
        }
        token.setVehicle(savedVehicle);
        // 2. Assign a Slot
            // we can have different strategies to allocate the slot
        ParkingLot parkingLot = parkingLotRepository.findParkingLotByGate(gate);
        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory
                .getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                .getSlot(parkingLot, vehicleType);

        token.setAssignedSlot(parkingSlot);
        parkingSlot.setSlotStatus(SlotStatus.FILLED);
        // 3. Return


        return null;
    }
}
