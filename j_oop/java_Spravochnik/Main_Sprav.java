package j_oop.java_Spravochnik;

import java.util.List;
import java.io.IOException;

public class Main_Sprav {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        // добавляем новые контакты
        phonebook.addContact(new Contact("Иванов Иван", "1234567890", "ivanov@example.com"));
        phonebook.addContact(new Contact("Петров Петр", "0987654321", "petrov@example.com"));
    
        // ищем контакты по поисковому запросу
        List<Contact> matchingContacts = phonebook.searchContacts("Петров");
        for (Contact contact : matchingContacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber() + ", " + contact.getEmail());
        }
    
        // экспортируем контакты в файл
        try {
            phonebook.exportContacts("contacts.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // импортируем контакты из файла
        try {
            phonebook.importContacts("contacts.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
