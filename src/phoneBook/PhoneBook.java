package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact ( String name,String PhoneNumber) {
        contacts.put(name, PhoneNumber);
    }
    public void removeContact(String name){
        contacts.remove(name);

    }
    public String findContacts(String name){
        return contacts.get(name);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                '}';
    }
}
