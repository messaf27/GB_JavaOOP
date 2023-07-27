package Lesson_06.HomeWork.MPV;

import Lesson_06.HomeWork.UI.Menu;

// Интерфейс Viewer для различных реализаций методов классов
public interface View {
    String getFirstName();
    String getLastName();
    int getInputIndex(String title);
    String getPhoneNumber();
    void displayUserMenu(String title, Menu menu);
    int getSelectedMenuItem();
    void displayObject(Object o);
    void exit();
}
