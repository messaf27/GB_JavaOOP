package Lesson_06.HomeWork.UI;

import Lesson_06.HomeWork.MPV.View;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner in;

    public ConsoleView() {
        this.in = new Scanner(System.in);
    }

    @Override
    public void displayUserMenu(String title, Menu menu) {
        StringBuilder buildMenu = new StringBuilder("\n");
        buildMenu.append("=============================================================\n");
        buildMenu.append(String.format("%s\n", title));
        buildMenu.append("-------------------------------------------------------------\n");
        for (int i = 0; i < menu.getNumItems(); i++) {
            buildMenu.append(String.format("[%d] %s\n", menu.getItemFromIndex(i).getIndex(), menu.getItemNameFromIndex(i)));
        }
        buildMenu.append("=============================================================\n");
        buildMenu.append(String.format("Выберете пункт меню от %d до %d: ", 1, menu.getNumItems()));

        System.out.print(buildMenu);
    }

    @Override
    public int getSelectedMenuItem() {
        int selectIndex = 0;
        selectIndex = in.nextInt();

        // TODO: Сделать проверку введеных данных
        //if(...)

        System.out.println("-------------------------------------------------------------\n");

        return selectIndex;
    }
}
