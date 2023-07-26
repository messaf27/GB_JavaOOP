package Lesson_06.HomeWork.PhoneBook;

import Lesson_06.HomeWork.ContactTypes.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookFile implements InterfacePhoneBook {
    private String filePath;
    private List<Contact> contactList;

    public PhoneBookFile(String filePath) {
        this.filePath = filePath;
        this.contactList = new ArrayList<>();
        this.readFile();
    }

    public void readFile() {
        try {
            File file = new File(this.filePath);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String frstName = reader.readLine();
            while (frstName != null) {
                String lstName = reader.readLine();
                String phNumber = reader.readLine();
                this.contactList.add(new Contact(frstName, lstName, phNumber));
                frstName = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveFile() {
        try (FileWriter writer = new FileWriter(this.filePath, false)) {
//                for (int i = 0; i < this.contactList.size(); i++) {
//                    Contact contact = this.contactList.get(i);
//                    writer.append(String.format("%s\n", contact.getFirstName()));
//                    writer.append(String.format("%s\n", contact.getLastName()));
//                    writer.append(String.format("%s\n", contact.getTelNumber()));
//                }
            for (Contact contact : this.contactList) {
                writer.append(String.format("%s\n", contact.getFirstName()));
                writer.append(String.format("%s\n", contact.getLastName()));
                writer.append(String.format("%s\n", contact.getTelNumber()));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public void addContact(Contact contact){
            contactList.add(contact);
            this.saveFile();
    }
    @Override
    public Contact getContact(int index) {
        if(contactList.size() > (index - 1))
            return contactList.get(index - 1);

        return null;
    }
    @Override
    public boolean removeContact(int index) {
        if(contactList.size() > (index - 1)) {
            contactList.remove(index - 1);
            this.saveFile();
            return true;
        }
        return false;
    }

    @Override
    public List<Contact> getContactList(){
        return this.contactList;
    }

    @Override
    public int getNumOfContacts(){
        return contactList.size();
    }

    @Override
    public String toString() {
        StringBuilder result = null;
        int counter = 1;

        result = new StringBuilder("Phone book list:\n");
        for (Contact contact : contactList) {
            result.append(String.format("%d) %s",
                    counter, contact));
            counter++;
        }
        return result.toString();
    }
}
