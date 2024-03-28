package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.CellState;
import TicTacToe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(cell.getRow() , cell.getCol()), null);
                }
            }
        }
        return null;
    }
}
