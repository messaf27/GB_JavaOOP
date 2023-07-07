package Lesson_02;

public class Cat implements ActionObject{
    @Override
    public void jump() {
        System.out.print("Кот прыгнул");
    }

    @Override
    public void run() {
        System.out.print("Кот побежал");
    }

    @Override
    public void doExercise(Exercise exercise) {
        exercise.completeExercise(this);
		System.out.println("Кот выполнил задание");//
    }
}
