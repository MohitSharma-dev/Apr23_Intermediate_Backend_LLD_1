package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy{
    HashMap<Integer , HashMap<Symbol, Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        // 0 -> { 'X' -> 1} , {'O' -> 2}
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getPlayerSymbol();
        if (!counts.containsKey(col)) {
            counts.put(col, new HashMap<>());
        }

        HashMap<Symbol, Integer> currentCol = counts.get(col);

        if (!currentCol.containsKey(symbol)) {
            currentCol.put(symbol, 0);
        }
        currentCol.put(symbol, currentCol.get(symbol) + 1);
        if (currentCol.get(symbol) == board.getSize())
            return true;

        return false;
    }

    public void handleUndo(Move move, Board board) {
        int col = move.getCell().getCol();
        HashMap < Symbol , Integer > currentCol = counts.get(col);
        currentCol.put(move.getPlayer().getPlayerSymbol(), currentCol.get(move.getPlayer().getPlayerSymbol()) - 1);
    }
}
