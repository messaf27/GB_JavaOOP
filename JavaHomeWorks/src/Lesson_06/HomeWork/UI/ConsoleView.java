package Lesson_06.HomeWork.UI;

import Lesson_06.HomeWork.MPV.View;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner in;

    public ConsoleView() {
        this.in = new Scanner(System.in);
    }

    private int getIntFix(){
        int result = 0;

        if(in.hasNextInt()){
            result = in.nextInt();
        }else{
            System.out.println("---------------------!!!ВНИМАНИЕ!!!--------------------------");
            System.out.println("Ошибка ввода, введите число!");
        }
        in.nextLine(); // Fix new line symbol
        return result;
    }
    @Override
    public String getFirstName() {
        System.out.print("Введите имя: ");
        return in.nextLine();
    }

    @Override
    public String getLastName() {
        System.out.print("Введите фамилию: ");
        return in.nextLine();
    }

    @Override
    public int getInputIndex(String title) {
        System.out.print(title);
        return getIntFix();
    }

    @Override
    public String getPhoneNumber() {
        System.out.printf("Введите номер телефона: ");
        return in.nextLine();
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
        int selectIndex = getIntFix();
        System.out.println("-------------------------------------------------------------");
        return selectIndex;
    }

    @Override
    public void displayObject(Object o) {
        System.out.print(o);
    }

    @Override
    public void exit() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Выход из приложения.");
        System.out.println("-------------------------------------------------------------");
    }
}
