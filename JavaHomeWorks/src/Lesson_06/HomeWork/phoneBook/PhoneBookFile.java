package Lesson_06.HomeWork.phoneBook;

import Lesson_06.HomeWork.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class PhoneBookFile implements InterfacePhoneBook {

    private String filePath;
    private List<Contact> contactList;

    public PhoneBookFile(String filePath) {
        this.filePath = filePath;
        this.contactList = new ArrayList<>();
        this.loadFile();
    }

    private void loadFile(){
        try {
            File file = new File(this.filePath);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                this.contactList.add(new Contact(fname, lname, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveFile() {
        try (FileWriter writer = new FileWriter(this.filePath, false)) {
                for (int i = 0; i < this.contactList.size(); i++) {
                    Contact contact = this.contactList.get(i);
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
    public boolean addContact(Contact contact){
        if(contact.equals(contact)) {
            contactList.add(contact);
            this.saveFile();
            return true;
        }
        return false;
    }
    @Override
    public Contact getCotact(int index) {
        if(contactList.size() > (index - 1)) {
            return contactList.get(index - 1);
        }
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
        String result = null;
        int counter = 1;

        result = "Phone book list:\n";
        for (Contact contact : contactList) {
            result += String.format("%d) %s",
                    counter, contact);
            counter++;
        }
        return  result;
    }
}
