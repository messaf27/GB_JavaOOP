package Lesson_03;

public interface Game {

    void start(int wordLen, int attemptsNum);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
