package j_oop.java_Spravochnik;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> searchContacts(String searchQuery) {
        List<Contact> matchingContacts = new ArrayList<>();

        for (Contact contact : contacts) {
            if (contact.getName().contains(searchQuery) ||
                    contact.getPhoneNumber().contains(searchQuery) ||
                    contact.getEmail().contains(searchQuery)) {
                matchingContacts.add(contact);
            }
        }

        return matchingContacts;
    }

    public void exportContacts(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);

        for (Contact contact : contacts) {
            writer.write(contact.toString() + "\n");
        }

        writer.close();
    }

    public void importContacts(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            String phoneNumber = parts[1];
            String email = parts[2];

            Contact contact = new Contact(name, phoneNumber, email);
            contacts.add(contact);
        }

        bufferedReader.close();
        reader.close();
    }
}