package Lesson_06.HomeWork.MPV;

import Lesson_06.HomeWork.ContactTypes.Contact;
import Lesson_06.HomeWork.PhoneBook.InterfacePhoneBook;

public class Model {
    InterfacePhoneBook currentBook;
    private int currentIndex;

    public Model(InterfacePhoneBook currentBook) {
        this.currentIndex = 1;
        this.currentBook = currentBook;
    }
    public int getCurrentIndex() {
        return currentIndex;
    }

    public boolean open(){
        return false;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Contact getCurrentContact() {
        return currentBook.getContact(currentIndex);
    }


}
