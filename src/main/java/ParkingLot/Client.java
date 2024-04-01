package ParkingLot;

import ParkingLot.controllers.TokenController;
import ParkingLot.dtos.IssueTokenRequestDTO;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TokenRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TokenService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TokenRepository tokenRepository = new TokenRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TokenService tokenService = new TokenService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                tokenRepository
        );

        TokenController tokenController = new TokenController(tokenService);

    }
}

// Issue token
// GenerateBill : Please implement this

// Controllers
// Services
// Repositories

// x -> y -> z
// Topological sorting
