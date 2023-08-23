package org.example.mapping.dtos;

import org.example.domain.enums.ContactType;

public record ContactDTO(long id,
                         String contactName,
                         ContactType contactType,
                         String address,
                         String email,
                         String cellPhone) {
}
