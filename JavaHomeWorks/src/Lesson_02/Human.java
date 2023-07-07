package Lesson_02;

public class Human implements ActionObject {
    private Exercise newExercise;
    @Override
    public void jump() {
        System.out.print("Человек прыгнул");
    }

    @Override
    public void run() {
        System.out.print("Человек побежал");
    }

    @Override
    public void doExercise(Exercise exercise) {
        exercise.completeExercise(this);
    }
}
