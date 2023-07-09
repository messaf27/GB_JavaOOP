package Lesson_03;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    protected int wordLen;
    protected int attemptsNum;
    protected String wordGame;
    protected GameStatus gameStatus;

    public AbstractGame() {
        this.gameStatus = GameStatus.INIT;
    }

    @Override
    public void start(int wordLen, int attemptsNum) {
        this.gameStatus = GameStatus.PLAY;
        this.wordLen = wordLen;
        this.attemptsNum = attemptsNum;
        this.wordGame = generateWord();
        System.out.println("Загадали слово: "+ this.wordGame);
    }
    public abstract List<String> generateCharList();
    private String generateWord() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        List<String> strList = generateCharList();

        for (int i = 0; i < this.wordLen; i++) {
            int idx = random.nextInt(strList.size());
            sb.append(strList.get(idx));
            strList.remove(idx);
        }
        return  sb.toString();
    }

    @Override
    public Answer inputValue(String value) {

        if(--this.attemptsNum == 0)
        {
            this.gameStatus = GameStatus.FINISH;
            return new Answer();
        }

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < value.length(); i++) {

            this.gameStatus = GameStatus.PLAY;

            if(value.charAt(i) == this.wordGame.charAt(i)) {
                bulls++;
            }
            if(this.wordGame.contains(String.valueOf(value.charAt(i)))){
                cows++;
            }
        }

        if(bulls == this.wordLen) this.gameStatus = GameStatus.WIN;

        return new Answer(bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    public int getCurrentAttempt() {
        return this.attemptsNum;
    }
}
