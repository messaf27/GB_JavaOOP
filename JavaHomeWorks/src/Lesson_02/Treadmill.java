package Lesson_02;

public class Treadmill implements Exercise {
    private int distance;

    public Treadmill() {
        this.distance = 0;
    }

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public boolean completeExercise(ActionObject actionObject) {
        boolean result = actionObject.run(this.distance);
        System.out.println(" по дорожке");
        return result;
    }
}
