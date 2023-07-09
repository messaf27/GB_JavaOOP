package Lesson_02;

public enum Fruits {
    ORANGE("Апельсин"),
    BANANA("Банан"),
    MANDARIN("Мандарин");

    String name;

    public String getName() {
        return name;
    }

    Fruits() {
    }

    Fruits(String name) {
        this.name = name;
    }
}
