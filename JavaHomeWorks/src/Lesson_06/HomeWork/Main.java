package Lesson_06.HomeWork;
/*
    Урок 6. ООП Дизайн и Solid.
    Дз на закрепление:
        Взять реализованный код в рамках последних семинаров (4-5) и продемонстрировать применение принципов,
    усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые
    рефакторим, какой принцип применяем и почему.
*/

import Lesson_06.HomeWork.MPV.Model;
import Lesson_06.HomeWork.MPV.Presenter;
import Lesson_06.HomeWork.PhoneBook.PhoneBookFile;
import Lesson_06.HomeWork.UI.ConsoleView;

public class Main {
    public static void main(String[] args) {
        // Иницмиализация модели MPV
        Presenter presenter = new Presenter(
                new Model(new PhoneBookFile("phonebook.txt")),
                new ConsoleView()
        );
        // Запуск приложения
        presenter.run();
    }
}
