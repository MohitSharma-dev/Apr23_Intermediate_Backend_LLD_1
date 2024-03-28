package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategy;
import TicTacToe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel = BotDifficultyLevel.EASY;
    BotPlayingStrategy botPlayingStrategy;

    public Bot(int id , String name , Symbol playerSymbol, BotDifficultyLevel botDifficultyLevel){
        super(id , name , PlayerType.BOT , playerSymbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory
                .getBotPlayingStrategyByDifficultyLevel(botDifficultyLevel);
    }
    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move makeMove(Board board){
        return botPlayingStrategy.makeMove(board);
    }
}
