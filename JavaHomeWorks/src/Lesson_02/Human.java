package Lesson_02;

public class Human implements ActionObject {
    static int id;
    private int distance;
    private int height;

    public Human() {
        id++;
        this.height = 0;
        this.distance = 0;
        System.out.printf("Cоздан объект [ID:%d] \"Человек\" \r\n", id);
    }
    public Human(int distance, int height) {
        id++;
        this.distance = distance;
        this.height = height;
        System.out.printf("Cоздан объект [ID:%d] \"Человек\" " +
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
            System.out.printf("[ID: %d] Человек прыгнул на высоту %d",
                    id, this.height);
            return true;
        }

        System.out.printf("[ID: %d] Человек не перепрыгнул высоту %d",
                id, this.height);
        return false;
    }

    @Override
    public boolean run(int distance) {
        if(distance <= this.distance) {
            System.out.printf("[ID: %d] Человек пробежал рассотяние %d", id, distance);
            return true;
        }
        System.out.printf("[ID: %d] Человек не смог пробежать рассотяние %d", id, distance);
        return false;
    }

    @Override
    public void doExercise(Exercise exercise) {
        exercise.completeExercise(this);

//        if(exercise.completeExercise(this)) {
//            System.out.println("Человек выполнил задание");
//        }else{
//            System.out.println("Человек не смог выполнить задание");//
//        }
    }
}
