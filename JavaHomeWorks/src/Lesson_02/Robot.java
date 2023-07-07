package Lesson_02;

public class Robot implements ActionObject{
    @Override
    public void jump() {
        System.out.print("Робот прыгнул");
    }

    @Override
    public void run() {
        System.out.print("Робот побежал");
    }

    @Override
    public void doExercise(Exercise exercise) {
        exercise.completeExercise(this);
    }
}
