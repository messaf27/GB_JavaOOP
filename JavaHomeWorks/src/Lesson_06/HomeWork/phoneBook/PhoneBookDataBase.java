package Lesson_06.HomeWork.phoneBook;

import Lesson_06.HomeWork.Contact;

import java.util.List;

public class PhoneBookDataBase implements InterfacePhoneBook {

    private String dbUrlPath;

    // Конструктор принтмает адрес базы данных в сети
    public PhoneBookDataBase(String dbUrlPath) {
        this.dbUrlPath = dbUrlPath;
    }

    // Далее все механизмы описывают работу с контактами в базе данных через сеть. (гипотетически)
    @Override
    public boolean addContact(Contact contact) {
        return false;
    }

    @Override
    public Contact getCotact(int index) {
        return null;
    }

    @Override
    public boolean removeContact(int index) {
        return false;
    }

    @Override
    public List<Contact> getContactList() {
        return null;
    }

    @Override
    public int getNumOfContacts() {
        return 0;
    }
}
