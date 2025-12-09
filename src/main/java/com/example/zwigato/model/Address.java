package com.example.zwigato.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
@Builder
public class Address {

    @Id
    private int id;

    private String houseNo;

    private String city;

    private String state;

    private int pinCode;
}
