package org.example.repository;

import org.example.mapping.dtos.ContactDTO;

import java.util.List;

public interface ContactRepository {
    List<ContactDTO> getAllContacts();
}
