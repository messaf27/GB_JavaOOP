package Lesson_06.HomeWork.MPV;

import Lesson_06.HomeWork.UI.Menu;

public interface View {
//    String getFirstName();
//    void setFirstName(String value);
//    String getLastName();
//    void setLastName(String value);
//    String getDescription();
//    void setDescription(String value);

    void displayUserMenu(String title, Menu menu);
    int getSelectedMenuItem();
}
