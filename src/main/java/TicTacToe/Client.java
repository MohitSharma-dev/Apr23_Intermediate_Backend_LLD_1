package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Game is Starting!");

        Game game = gameController.startGame(3 , new ArrayList<>() , new ArrayList<>());
//        Game game1 = gameController.startGame();
        GameController gameController1 = new GameController();

        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }

        if(gameController.checkState(game).equals(GameState.DRAW)){
            System.out.println("The game ends in a DRAW!");
        } else if(gameController.checkState(game).equals(GameState.SUCCESS)){
            System.out.println("The Winner is : " + gameController.getWinner());
        }


    }
}
