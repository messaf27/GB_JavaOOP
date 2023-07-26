package Lesson_06.HomeWork.UI;

public class MenuItem {
    private String itemName;
    private int index = 0;

    public MenuItem(String name, int index) {
        this.index = index;
        this.itemName = name;
    }
    public int getIndex() {
        return index;
    }

    public String getName() {
        return itemName;
    }
}
