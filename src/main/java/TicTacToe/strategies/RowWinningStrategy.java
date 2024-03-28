package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    HashMap<Integer , HashMap<Symbol , Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        // 0 -> { 'X' -> 1} , {'O' -> 2}
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getPlayerSymbol();
        if(!counts.containsKey(row)){
            counts.put(row, new HashMap<>());
        }

        HashMap < Symbol , Integer > currentRow = counts.get(row);

        if(!currentRow.containsKey(symbol)){
            currentRow.put(symbol , 0);
        }
        currentRow.put(symbol , currentRow.get(symbol) + 1);
        if(currentRow.get(symbol) == board.getSize())
            return true;

        return false;
    }

    @Override
    public void handleUndo(Move move, Board board) {
        int row = move.getCell().getRow();
        HashMap < Symbol , Integer > currentRow = counts.get(row);
        currentRow.put(move.getPlayer().getPlayerSymbol(), currentRow.get(move.getPlayer().getPlayerSymbol()) - 1);
    }
}
