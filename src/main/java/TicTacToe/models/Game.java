package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    List<Move> moves;
    Player winner;
    int nextPlayerIndex;
    GameState gameState;
    List<WinningStrategy> winningStrategies;

    public Game(int dimension , List<Player> players, List<WinningStrategy> winningStrategies){
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
    }

    public static class Builder{
        int dimension;
        List<Player> players;
        List<WinningStrategy> winningStrategies;

        Builder(){
            this.dimension = 3;
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
        }
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder addPlayer(Player player){
            this.players.add(player);
            return this;
        }

        public Builder addWinningStrategy(WinningStrategy winningStrategy){
            this.winningStrategies.add(winningStrategy);
            return this;
        }

        void validateBotCount(){
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT))
                    botCount += 1;
            }
            if(botCount > 1){
                throw new RuntimeException("Too many Bots!");
            }
        }

        void validateNoOfPlayers(){
            if(players.size() != this.dimension - 1)
                throw new RuntimeException("No of players are invalid!");
        }

        void validateSymbolCount(){
            // PLEASE COMPLETE THIS
        }
        void validate(){
            // Bot count
            validateBotCount();
            // no of Players
            validateNoOfPlayers();
            // symbols
            validateSymbolCount();
            // HW for you : Please execute this validation
        }
        public Game build(){

            // validations
            validate();

            return new Game(
                    this.dimension,
                    this.players,
                    this.winningStrategies
            );
        }
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void displayBoard(){
        board.display();
    }

    public boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()){
            return false;
        }

        if(!board.getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY))
            return false;

        return true;

    }
    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);

        System.out.println("It is " + currentPlayer.getName() + "'s turn! Please make your move.");
        Move move = currentPlayer.makeMove(board);

        if(!validateMove(move)){
            System.out.println("Invalid Move! Please try again");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange =  board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getPlayerSymbol());

        move.setPlayer(currentPlayer);
        move.setCell(cellToChange);
//        Move finalMoveObject = new Move(cellToChange , currentPlayer);
        moves.add(move);

        nextPlayerIndex += 1;
        nextPlayerIndex %= players.size();

        if(checkWinner(board , move)){
            gameState = GameState.SUCCESS;
            winner = currentPlayer;
        } else if (moves.size() == board.getSize() * board.getSize()){
            gameState = GameState.DRAW;
        }

    }

    public boolean checkWinner(Board board , Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(move, board)){
                return true;
            }
        }
        return false;
    }

    public void undo(){
        // whatever you did while making the move, you need to reverse it
        if(moves.isEmpty()){
            System.out.println("Nothing to Undo!");
            return;
        }
        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(moves.size() - 1);

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);

        nextPlayerIndex -= 1;
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();

        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleUndo(lastMove , board);
        }
    }
}

// (a - 1 + b) % b