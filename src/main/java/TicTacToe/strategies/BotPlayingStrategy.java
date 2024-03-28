package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
