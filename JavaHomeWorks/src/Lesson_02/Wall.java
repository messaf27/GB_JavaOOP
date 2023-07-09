package Lesson_02;

public class Wall implements Exercise{
    private int height;

    public Wall() {
        this.height = 0;
    }

    public Wall(int height) {
        this.height = height;
    }

    public boolean completeExercise(ActionObject actionObject) {
        boolean result = actionObject.jump(this.height);
        System.out.println(" через стену");
        return result;
    }
}
