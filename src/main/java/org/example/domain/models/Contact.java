package org.example.domain.models;

import lombok.*;
import org.example.domain.enums.ContactType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Contact {
    // nombre, dirección, tipo de contact, correo, teléfono

    private long id;
    private String contactName;
    private ContactType contactType;
    private String address;
    private String email;
    private String cellPhone;

}
