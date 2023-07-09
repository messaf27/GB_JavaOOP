package Lesson_02;

/*
Домашнее задание на закрепление :
1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса.
    Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
    должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
    печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
    (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
    этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
    списку он препятствий не идет.
*/

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static int randomGetInt(int start, int end) {
//        Random random = new Random();
        return new Random().nextInt((end - start) + 1) + start;
    }
    public static void main(String[] args) {
        // Создаём массив с участниками
        ArrayList<ActionObject> members = new ArrayList<ActionObject>();
        for (int i = 0; i < 5; i++) {
            members.add(new Human(randomGetInt(1, 25), randomGetInt(1, 25)));
            members.add(new Cat(randomGetInt(1, 25), randomGetInt(1, 25)));
            members.add(new Robot(randomGetInt(1, 25), randomGetInt(1, 25)));
        }

        // Создаём массив с препятствиями
        ArrayList<Exercise> obstacles = new ArrayList<Exercise>();
        for (int i = 0; i < 5; i++) {
            obstacles.add(new Wall(randomGetInt(3, 18)));
            obstacles.add(new Treadmill(randomGetInt(1, 36)));
        }

        // Проходим каждым участником набор испытаний
        for (ActionObject objMember: members) {
            for (Exercise ex: obstacles){
                objMember.doExercise(ex);
            }
        }
    }
}
