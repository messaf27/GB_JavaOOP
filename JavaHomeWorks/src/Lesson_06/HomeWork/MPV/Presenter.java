package Lesson_06.HomeWork.MPV;

import Lesson_06.HomeWork.ContactTypes.Contact;
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

        while (true)
        {
            view.displayUserMenu(
                    String.format("Телефонная книга вер. 1.0 (посл. ред.: %s)\n" + "Количество контактов: %d",
                            model.getCurrentBook().getDateTimeLastUpdate(), model.getCurrentBook().getNumOfContacts()),
                    mainMenu);

            int selectedItem = view.getSelectedMenuItem();
            // Exit program item menu
            if(selectedItem == 4) {
                this.exit();
                break;
            }else if (selectedItem > 0 && selectedItem < mainMenu.getNumItems()) {
                switch (selectedItem) {
                    case 1 -> {
                        view.displayObject(model.getCurrentBook());
                    }
                    case 2 -> {
                        model.getCurrentBook().addContact(
                                new Contact(
                                        view.getFirstName(),
                                        view.getLastName(),
                                        view.getPhoneNumber()
                                )
                        );
                    }
                    case 3 -> {
                        int index = view.getInputIndex("Введите индекс контакта: ");
                        if(index > 0 && index <= model.getCurrentBook().getNumOfContacts()){
                            model.getCurrentBook().removeContact(index);
                        }else {
                            view.displayObject(String.format("Контакт %d не найден!", index));
                        }
                    }
                }
            }else{
                view.displayObject(String.format("Пункт меню № %d не найден, повторите ввод!", selectedItem));
            }
        }
    }

    public void run(){
        mainMenu();
    }

    public void exit(){
        model.getCurrentBook().close();
        view.exit();
    }
}
