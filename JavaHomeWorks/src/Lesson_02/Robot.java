package Lesson_02;

public class Robot implements ActionObject{
    static int id;
    private int distance;
    private int height;

    public Robot() {
        id++;
        this.height = 0;
        this.distance = 0;
        System.out.printf("Cоздан объект [ID:%d] \"Робот\" \r\n", id);
    }
    public Robot(int distance, int height) {
        id++;
        this.distance = distance;
        this.height = height;
        System.out.printf("Cоздан объект [ID:%d] \"Робот\" " +
                        "Параметры: " +
                        "Бег = %d, " +
                        "Прыжки = %d\r\n",
                id,
                this.distance,
                this.height);
    }
    @Override
    public boolean jump(int height) {
        if(height <= this.height) {
            System.out.printf("[ID: %d] Робот прыгнул на высоту %d",
                    id, this.height);
            return true;
        }

        System.out.printf("[ID: %d] Робот не перепрыгнул высоту %d",
                id, this.height);
        return false;
    }

    @Override
    public boolean run(int distance) {
        if(distance <= this.distance) {
            System.out.printf("[ID: %d] Робот пробежал рассотяние %d", id, distance);
            return true;
        }
        System.out.printf("[ID: %d] Робот не смог пробежать рассотяние %d", id, distance);
        return false;
    }

    @Override
    public void doExercise(Exercise exercise) {
        exercise.completeExercise(this);
//        if(exercise.completeExercise(this)) {
//            System.out.println("Робот выполнил задание");
//        }else{
//            System.out.println("Робот не смог выполнить задание");//
//        }
    }
}
