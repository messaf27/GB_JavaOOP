package Lesson_06.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private String filePath;
    private List<Contact> contactList;

    public PhoneBook(String filePath) {
        this.filePath = filePath;
        this.contactList = new ArrayList<>();
    }

    public boolean addContact(Contact contact){
        if(contact.equals(contact)) {
            contactList.add(contact);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = null;
        int counter = 1;

        result = String.format("Phone book file: %s list:\n", filePath);

        for (Contact contact : contactList) {
            result += String.format("%d) %s",
                    counter, contact);
            counter++;
        }
        return  result;
    }
}
