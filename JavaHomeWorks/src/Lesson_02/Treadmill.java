package Lesson_02;

public class Treadmill implements Exercise {
    @Override
    public void completeExercise(ActionObject abj) {
        abj.run();
        System.out.println(" по дорожке");
    }
}
