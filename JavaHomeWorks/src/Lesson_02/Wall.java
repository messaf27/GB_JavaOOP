package Lesson_02;

public class Wall implements Exercise{
    public void completeExercise(ActionObject abj) {
        abj.jump();
        System.out.println(" через стену");
    }
}
