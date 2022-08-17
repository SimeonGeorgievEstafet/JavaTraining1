package DataStructures;

import java.util.*;

public class Phonebook {
    Map<String, String> phoneRecord = new HashMap<>();
    String name;
    String number;

    public void save(String name, String number) {
        phoneRecord.put(name, number);
    }

    public void search(String name) {
        if (phoneRecord.containsKey(name)) {
            System.out.println("Name of the contact is: " + name);
            System.out.println("Number of the contact is: " + phoneRecord.get(name));
        } else {
            System.out.println("Contact does not exist!");
        }
    }

    public void getAllContactsAlphabetically() {
        //The TreeMap will automatically sort the phoneRecord.
        TreeMap<String, String> sorted = new TreeMap<>(phoneRecord);
        System.out.println(sorted);
    }


    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.save("nameC", "number3");
        phonebook.save("nameA", "number1");
        phonebook.save("nameB", "number2");

        phonebook.search("nameA");
        phonebook.search("nameB");
        phonebook.search("missingNumber");

        phonebook.getAllContactsAlphabetically();
    }
}
