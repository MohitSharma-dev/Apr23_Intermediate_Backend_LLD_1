package TicTacToe.models;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private PlayerType playerType;
    private Symbol playerSymbol;
    private Scanner scanner;

    public Player(int id, String name , PlayerType playerType, Symbol playerSymbol){
        this.id  = id;
        this.name = name;
        this.playerType = playerType;
        this.playerSymbol = playerSymbol;
        this.scanner = new Scanner(System.in);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(Symbol playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public Move makeMove(Board board){
        System.out.println("Please enter the row where you want to move");
        int row = scanner.nextInt();
        System.out.println("Please enter the column where you want to move");
        int col = scanner.nextInt();

        return new Move(new Cell(row , col) , this);
    }
}
