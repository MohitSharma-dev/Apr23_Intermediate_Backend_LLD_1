package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.Optional;

public class GateRepository {
    public Optional<Gate> findGateById(Long gateId){
        // db.execute('select * from gate where gate_id = gateId');
        return Optional.empty();
    }
}

