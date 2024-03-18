package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public class ColumnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {
        return false;
    }
}
