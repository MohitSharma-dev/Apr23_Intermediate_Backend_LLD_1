package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.models.PlayerType;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        // 1. no of Players
        // 2. Every player should have a diff symbol
        // 3. There should be only 1 bot in the game
        return Game
                .getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public void displayBoard(Game game){

    }

    public void makeMove(Game game){

    }

    public GameState checkState(Game game){
        return GameState.IN_PROGRESS;
    }

    public Player getWinner(Game game){
        return null;
    }
    public void undo(Game game){

    }
}

// Client -> GameController -> Service

// 1. start the Game : taking the size, creating the board, creating the players
// 2. while the game state is IN_PROGRESS
    // 2.1 Display the board
    // 2.2 Make the move

// 3. Based on the game state you will return the result
    // DRAW
    // WINNER

// 4. Undo

