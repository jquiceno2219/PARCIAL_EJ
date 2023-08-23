package org.example.services;

import org.example.mapping.dtos.ContactDTO;

import java.util.List;

public interface ContactService {
    List<ContactDTO> filterByType();
}
