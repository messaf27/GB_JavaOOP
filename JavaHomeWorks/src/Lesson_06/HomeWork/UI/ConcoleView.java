package Lesson_06.HomeWork.UI;

import Lesson_06.HomeWork.MPV.View;

import java.util.Scanner;

public class ConcoleView implements View {

    private Scanner in;
    private Menu menu;
    public ConcoleView() {
        this.in = new Scanner(System.in);
        this.menu = new Menu();
        menu.addMenuItem("Вывести весь список контактов");
        menu.addMenuItem("Вывести весь список контактов");
    }

    @Override
    public String getFirstName() {
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getDescription() {
        System.out.printf("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);
    }

    @Override
    public void menu() {
//        System.out.printf("\n" +
//                "=============================================================\n" +
//                "Телефонная книга вер.: %d, дата последнего обновления: %s" +
//                "-------------------------------------------------------------\n" +
//                "=============================================================\n" +
//                "",
//                );
        System.out.println("Сдесь будет меню!!!");
    }
}
