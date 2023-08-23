package org.example.mapping.mappers;

import org.example.domain.models.Contact;
import org.example.mapping.dtos.ContactDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ContactMapper {
    public static ContactDTO mapFrom(Contact source){
        return new ContactDTO(source.getId(),
                source.getContactName(),
                source.getContactType(),
                source.getAddress(),
                source.getEmail(),
                source.getCellPhone());
    }

    public static Contact mapFrom(ContactDTO source){
        return new Contact(source.id(),
                source.contactName(),
                source.contactType(),
                source.address(),
                source.email(),
                source.cellPhone());
    }

    public static List<ContactDTO> mapFrom(List<Contact> source) {
        return source.parallelStream()
                .map(ContactMapper::mapFrom)
                .collect(Collectors.toList());
    }

    public static List<Contact> mapFromDto(List<ContactDTO> source){
        return source.parallelStream().map(ContactMapper::mapFrom).collect(Collectors.toList());
    }
}