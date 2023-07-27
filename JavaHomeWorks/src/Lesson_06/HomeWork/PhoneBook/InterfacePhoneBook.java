package Lesson_06.HomeWork.PhoneBook;

import Lesson_06.HomeWork.ContactTypes.Contact;

import java.time.LocalDateTime;
import java.util.List;
import java.time.LocalDate;
public interface InterfacePhoneBook {
    void open();
    void close();
    String getDateTimeLastUpdate();
    void addContact(Contact contact);
    Contact getContact(int index);
    boolean removeContact(int index);
    List<Contact> getContactList();
    int getNumOfContacts();
}
