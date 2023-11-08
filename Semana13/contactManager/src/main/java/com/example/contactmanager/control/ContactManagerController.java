package com.example.contactmanager.control;

import com.example.contactmanager.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase aplica el patrOn singleton
 */
public class ContactManagerController {

    // instancia Unica
    public static   ContactManagerController contactManagerController;
    private List<Contact> contacts;

    public ContactManagerController() {
        contacts = new ArrayList<>();
    }
    public static ContactManagerController getContactManagerController(){
        if (contactManagerController == null)
            contactManagerController = new ContactManagerController();
        return contactManagerController;
    }

    public void addContact(String na, String em) {
        contacts.add(new Contact(na, em));
    }

    public List<Contact> getContacts(){
        return contacts;
    }
}
