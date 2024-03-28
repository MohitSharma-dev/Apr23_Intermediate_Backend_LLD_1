package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Move move, Board board);
    public void handleUndo(Move move , Board board);
}
