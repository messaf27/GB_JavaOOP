package Lesson_06.HomeWork.MPV;

import Lesson_06.HomeWork.ContactTypes.Contact;
import Lesson_06.HomeWork.PhoneBook.InterfacePhoneBook;

import javax.print.DocFlavor;

public class Model {
    private InterfacePhoneBook currentBook;
    private int currentIndex;

    public Model(InterfacePhoneBook currentBook) {
        this.currentIndex = 1;
        this.currentBook = currentBook;
    }
    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public InterfacePhoneBook getCurrentBook(){
        return this.currentBook;
    }

    public Contact getCurrentContact() {
        return currentBook.getContact(currentIndex);
    }
    public String getLastUpdateDateTime() {
        return currentBook.getDateTimeLastUpdate();
    }




}
