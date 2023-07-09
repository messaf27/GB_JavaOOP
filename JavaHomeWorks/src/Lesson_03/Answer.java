package Lesson_03;

public class Answer {
    private int bulls = 0;
    private int cows = 0;

    public Answer() {
    }

    @Override
    public String toString() {
        return "Answer{" +
                "bulls=" + bulls +
                ", cows=" + cows +
                '}';
    }

    public Answer(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

}
