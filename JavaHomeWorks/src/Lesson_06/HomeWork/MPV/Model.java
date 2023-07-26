package Lesson_06.HomeWork.MPV;

import Lesson_06.HomeWork.contact.Contact;
import Lesson_06.HomeWork.phoneBook.InterfacePhoneBook;

import java.util.PrimitiveIterator;

public class Model {
    InterfacePhoneBook currentBook;
    private int currentIndex;

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Model(InterfacePhoneBook currentBook) {
        this.currentIndex = 1;
        this.currentBook = currentBook;
    }

    public Contact getCurrentContact() {
        return currentBook.getCotact(currentIndex);
    }


}
