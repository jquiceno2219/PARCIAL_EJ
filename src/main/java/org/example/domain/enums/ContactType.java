package org.example.domain.enums;

import java.util.Arrays;

public enum ContactType {
    FAMILY("1"),
    WORK("2"),
    FRIENDS("3");

    private final String value;

    public String getValue() {
        return value;
    }
    ContactType(String value){
        this.value = value;
    }

    public static ContactType fromValue(String value) {
        return Arrays.stream(ContactType.values())
                .filter(e->e.getValue().equalsIgnoreCase(value))
                .findAny()
                .orElseThrow(()->new RuntimeException("Category not found"));

    }
}
