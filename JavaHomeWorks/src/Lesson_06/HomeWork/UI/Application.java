package Lesson_06.HomeWork.UI;

import Lesson_06.HomeWork.MPV.Model;
import Lesson_06.HomeWork.MPV.Presenter;
import Lesson_06.HomeWork.MPV.View;
import Lesson_06.HomeWork.PhoneBook.PhoneBookFile;

public class Application {
    public boolean runApp(){
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Model model = new Model(new PhoneBookFile("phonebook.txt"));

        Presenter presenter = new Presenter(model, view);
        return true;
    }
}
