package org.example;

import org.example.repository.ContactRepository;
import org.example.repository.impl.ContactRepositoryImpl;
import org.example.services.ContactService;
import org.example.services.impl.ContactServiceImpl;

public class Main {
    public static void main(String[] args) {
        ContactRepository contactRepository = new ContactRepositoryImpl();
        ContactService contactService = new ContactServiceImpl(contactRepository);


        System.out.println(contactService.filterByType());
    }
}