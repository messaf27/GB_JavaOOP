package Lesson_06.HomeWork.PhoneBook;

import Lesson_06.HomeWork.ContactTypes.Contact;

import java.util.List;

public interface InterfacePhoneBook {
    void addContact(Contact contact);
    Contact getContact(int index);
    boolean removeContact(int index);
    List<Contact> getContactList();
    int getNumOfContacts();
}
