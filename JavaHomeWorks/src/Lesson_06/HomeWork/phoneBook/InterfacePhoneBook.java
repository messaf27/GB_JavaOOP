package Lesson_06.HomeWork.phoneBook;

import Lesson_06.HomeWork.Contact;

import java.util.List;

public interface InterfacePhoneBook {
    public boolean addContact(Contact contact);
    public Contact getCotact(int index);
    public boolean removeContact(int index);
    public List<Contact> getContactList();
    public int getNumOfContacts();
}
