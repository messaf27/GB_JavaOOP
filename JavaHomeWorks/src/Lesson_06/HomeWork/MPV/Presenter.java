package Lesson_06.HomeWork.MPV;

import Lesson_06.HomeWork.UI.Menu;
import Lesson_06.HomeWork.UI.MenuItem;

import java.util.Arrays;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void mainMenu(){
        Menu mainMenu = new Menu(Arrays.asList(
                new MenuItem("Прочитать телефонную книгу", 1),
                new MenuItem("Добавить контакт", 2),
                new MenuItem("Удалить контакт", 3),
                new MenuItem("Выйти из программы", 4)
        ));

//        int selectedItem = 0;
//        while (selectedItem != 4)
        while (true)
        {
            view.displayUserMenu(
                    String.format("Телефонная книга вер. 1.0 (посл. ред.: %s)\n" + "Количество контактов: %d",
                            model.currentBook.getDateTimeLastUpdate(), model.currentBook.getNumOfContacts()),
                    mainMenu);

            int selectedItem = view.getSelectedMenuItem();
            if(selectedItem == 4) {
                System.out.println("Выход...");
                break;
            }
            switch (selectedItem) {
                case 1 -> {
                    System.out.println(model.currentBook);
                }
                case 2 -> {
                    System.out.println("Действие пункта 2 еще не готово...");
                }
                case 3 -> {
                    System.out.println("Действие пункта 3 еще не готово...");
                }
            }
        }
    }

    public void mainMenuProcess(){

    }
}
