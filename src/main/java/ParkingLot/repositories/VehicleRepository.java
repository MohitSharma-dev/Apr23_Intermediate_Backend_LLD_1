package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {

    public Optional<Vehicle> findVehicleByNumber(String Number){
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle){
        // certain actions to save the object
        return vehicle;
    }
}
