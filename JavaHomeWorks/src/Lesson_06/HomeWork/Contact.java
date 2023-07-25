package Lesson_06.HomeWork;

import java.util.Objects;

public class Contact implements Comparable<Contact>{
    private static int id;
    private String firstName;
    private String lastName;
    private String telNumber;

    public Contact(String firstName, String lastName, String telNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
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
        return String.format("%s %s, %s\n",
        this.firstName, this.lastName, this.telNumber);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName) && Objects.equals(telNumber, contact.telNumber);
    }
    @Override
    public int compareTo(Contact o) {
        return 0;
    }
}
