package Lesson_06.HomeWork;
/*
    Урок 6. ООП Дизайн и Solid.
    Дз на закрепление:
        Взять реализованный код в рамках последних семинаров (4-5) и продемонстрировать применение принципов,
    усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые
    рефакторим, какой принцип применяем и почему.

    Взял код вот этого задания:
        Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
    под форматами понимаем структуру файлов, например:
    * в файле на одной строке хранится одна часть записи, пустая строка - разделитель
*/

import Lesson_06.HomeWork.ContactTypes.Contact;
import Lesson_06.HomeWork.MPV.Model;
import Lesson_06.HomeWork.MPV.Presenter;
import Lesson_06.HomeWork.MPV.View;
import Lesson_06.HomeWork.PhoneBook.InterfacePhoneBook;
import Lesson_06.HomeWork.PhoneBook.PhoneBookFile;
import Lesson_06.HomeWork.UI.ConcoleView;

public class Main {
    public static void main(String[] args) {
//        Contact contact = new Contact("Egor", "Orlenok", "+79143701845");
//        System.out.println("contact = " + contact);

//        InterfacePhoneBook phoneBookFromDataBase = new PhoneBookDataBase("https://phonebook.ru/pb.db");
        InterfacePhoneBook phoneBookFromFile = new PhoneBookFile("phonebook.txt");

        phoneBookFromFile.addContact(new Contact("Egor", "Orlenok", "+79143701845"));
        phoneBookFromFile.addContact(new Contact("Ivan", "Petrov", "+79143708945"));
        phoneBookFromFile.addContact(new Contact("Petr", "Kuzneysov", "+7911144452"));
        phoneBookFromFile.addContact(new Contact("Konstantin", "Smirnov", "+79993631825"));
        phoneBookFromFile.addContact(new Contact("Roman", "Sutulov", "+79143782565"));

        System.out.println(phoneBookFromFile);
//
//        System.out.println("phoneBookFromFile.removeContact(5) = " + phoneBookFromFile.removeContact(5));
//        System.out.println("phoneBookFromFile.removeContact(7) = " + phoneBookFromFile.removeContact(7));
//        System.out.println("phoneBookFromFile.removeContact(15) = " + phoneBookFromFile.removeContact(15));
//
//        System.out.println(phoneBookFromFile);

//        Presenter presenter = new Presenter(
//                new Model(
//                        new PhoneBookFile("phonebook.txt")),
//                new ConcoleView()
//        );
    }
}
