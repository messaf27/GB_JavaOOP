package Lesson_06.HomeWork.ContactTypes;

import java.util.Objects;

public class Contact {
    private static int id = 0;
    private String firstName;
    private String lastName;
    private String telNumber;
    private Integer uniqId;

    public Contact(String firstName, String lastName, String telNumber) {
        id++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
        this.uniqId = id;

    }

    public static int getId() {
        return id;
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
