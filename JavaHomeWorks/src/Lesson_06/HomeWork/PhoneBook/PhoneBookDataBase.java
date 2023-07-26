package Lesson_06.HomeWork.PhoneBook;

import Lesson_06.HomeWork.ContactTypes.Contact;

import java.util.List;

public class PhoneBookDataBase implements InterfacePhoneBook {

    private String dbUrlPath;

    // Конструктор принтмает адрес базы данных в сети
    public PhoneBookDataBase(String dbUrlPath) {
        this.dbUrlPath = dbUrlPath;
    }

    @Override
    public String getDateTimeLastUpdate() {
        return null;
    }

    // Далее все механизмы описывают работу с контактами в базе данных через сеть. (гипотетически)
    @Override
    public void addContact(Contact contact) {
        // TODO: Добавить реализацию метода
    }

    @Override
    public Contact getContact(int index) {
        // TODO: Добавить реализацию метода
        return null;
    }

    @Override
    public boolean removeContact(int index) {
        // TODO: Добавить реализацию метода
        return false;
    }

    @Override
    public List<Contact> getContactList() {
        // TODO: Добавить реализацию метода
        return null;
    }

    @Override
    public int getNumOfContacts() {
        // TODO: Добавить реализацию метода
        return 0;
    }
}
