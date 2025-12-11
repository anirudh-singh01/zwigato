package com.example.zwigato.model;

import com.example.zwigato.utility.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column(nullable = false, length = 10)
    private String mobNo;

    @Enumerated(EnumType.STRING)
    @Column
    private Gender gender;

    private List<Address> address;

    private List<OrderEntity> order;
}
