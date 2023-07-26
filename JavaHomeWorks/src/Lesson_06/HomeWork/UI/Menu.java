package Lesson_06.HomeWork.UI;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuList;

    public Menu() {
        menuList = new ArrayList<>();
    }

    public int addMenuItem(String itemName)
    {
        MenuItem item = new MenuItem(itemName);
        this.menuList.add(item);
        return  item.getIndex();
    }

}
