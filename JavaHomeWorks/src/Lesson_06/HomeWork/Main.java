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

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Egor", "Orlenok", "+79143701845");
        System.out.println("contact = " + contact);

        PhoneBook phoneBook = new PhoneBook("pb.txt");
        phoneBook.addContact(new Contact("Egor", "Orlenok", "+79143701845"));
        phoneBook.addContact(new Contact("Ivan", "Petrov", "+79143708945"));
        phoneBook.addContact(new Contact("Petr", "Kuzneysov", "+7911144452"));
        phoneBook.addContact(new Contact("Konstantin", "Smirnov", "+79993631825"));
        phoneBook.addContact(new Contact("Roman", "Sutulov", "+79143782565"));

        System.out.println(phoneBook);
    }
}
