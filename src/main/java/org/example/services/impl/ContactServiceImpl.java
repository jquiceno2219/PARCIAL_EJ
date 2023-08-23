package org.example.services.impl;

import org.example.domain.enums.ContactType;
import org.example.mapping.dtos.ContactDTO;
import org.example.repository.ContactRepository;
import org.example.services.ContactService;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {
    private ContactRepository repository;
    private List<ContactDTO> contacts = new ArrayList<>();

    public ContactServiceImpl(ContactRepository repository){
        this.repository = repository;
        contacts = repository.getAllContacts();
    }

    //METODOS
    //filtrar por categoria
    public List<ContactDTO> filterByType() {
        String category = "1";
        List<ContactDTO> filterByType = contacts.stream()
                .filter(e -> e.contactType().equals(ContactType.fromValue(category)))
                .toList();

        return filterByType;
    }

//METODO PARA CONTAR por cat
    public List<ContactDTO> countByType() {
    String category = "1";

    List<ContactDTO> countByType = contacts.stream()
            .filter(e -> e.contactType().equals(ContactType.fromValue(category)))
            .toList();

    return countByType;
}

}
