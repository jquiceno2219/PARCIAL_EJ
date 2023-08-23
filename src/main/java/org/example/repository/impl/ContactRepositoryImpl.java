package org.example.repository.impl;

import org.example.domain.enums.ContactType;
import org.example.domain.models.Contact;
import org.example.mapping.dtos.ContactDTO;
import org.example.mapping.mappers.ContactMapper;
import org.example.repository.ContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {
    private List<Contact> contacts;

    public ContactRepositoryImpl() {
        contacts = new ArrayList<>();
        Contact contact1 = new Contact(1, "Juan", ContactType.FAMILY, "Casa", "email 1", "315");

        contacts.add(contact1);
        contacts.toString();
    }

    public List<ContactDTO> getAllContacts() {
        return ContactMapper.mapFrom(contacts);
    }
}
