package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Player player, Board board);
}
