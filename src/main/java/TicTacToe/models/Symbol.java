package TicTacToe.models;

public class Symbol {
    private char sym;

    private String color;

    public Symbol(char sym , String color){
        this.sym = sym;
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSym() {
        return sym;
    }

    public void setSym(char sym) {
        this.sym = sym;
    }
}
