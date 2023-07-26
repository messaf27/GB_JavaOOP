package Lesson_06.HomeWork.UI;

public class MenuItem {
    private String name;
    static int index;

    public MenuItem(String name) {
        this.name = name;
        this.index = 1;
    }
    public int getIndex() {
        return index;
    }
}
