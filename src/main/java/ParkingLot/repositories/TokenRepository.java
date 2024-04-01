package ParkingLot.repositories;

import ParkingLot.models.Token;

import java.util.Map;
import java.util.TreeMap;

public class TokenRepository {
    private Map<Long , Token> tokens = new TreeMap<>();
    private Long previousId = 0L;
    public Token save(Token token){
        previousId += 1;
        token.setId(previousId);
        tokens.put(previousId , token);
        return token;
    }
}
