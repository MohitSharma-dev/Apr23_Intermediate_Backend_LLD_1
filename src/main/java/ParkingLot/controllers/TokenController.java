package ParkingLot.controllers;

import ParkingLot.dtos.IssueTokenRequestDTO;
import ParkingLot.dtos.IssueTokenResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Gate;
import ParkingLot.models.Operator;
import ParkingLot.models.Token;
import ParkingLot.models.Vehicle;
import ParkingLot.services.TokenService;

public class TokenController {
    private TokenService tokenService;

    public TokenController(TokenService tokenService){
        this.tokenService = tokenService;
    }
    // DTO : Data transfer object
    public IssueTokenResponseDTO issueToken(IssueTokenRequestDTO issueTokenRequestDTO){
        // call the service
        IssueTokenResponseDTO response = new IssueTokenResponseDTO();
        try{
            Token token = tokenService.issueToken(
                    issueTokenRequestDTO.getGateId(),
                    issueTokenRequestDTO.getVehicleType(),
                    issueTokenRequestDTO.getVehicleNumber(),
                    issueTokenRequestDTO.getOwnerName()
            );
            response.setToken(token);
            response.setRequestStatus(ResponseStatus.SUCCESS);
        } catch(Exception ex){
            response.setRequestStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }

        return response;

    }
}

