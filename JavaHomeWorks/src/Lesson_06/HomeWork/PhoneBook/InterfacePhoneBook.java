package Lesson_06.HomeWork.PhoneBook;

import Lesson_06.HomeWork.Contact.Contact;

import java.util.List;

public interface InterfacePhoneBook {
    boolean addContact(Contact contact);
    Contact getCotact(int index);
    boolean removeContact(int index);
    List<Contact> getContactList();
    int getNumOfContacts();
}
