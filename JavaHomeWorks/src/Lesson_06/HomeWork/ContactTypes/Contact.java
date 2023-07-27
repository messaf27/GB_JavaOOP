package Lesson_06.HomeWork.ContactTypes;

import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName;
    private String telNumber;
    private Integer uniqId;

    public Contact(String firstName, String lastName, String telNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
        this.uniqId = new UniqID(2048).creteId();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    @Override
    public String toString() {
        return String.format("[ID:%04d] %s %s, %s\n",
                this.uniqId, this.firstName, this.lastName, this.telNumber);
    }
}
