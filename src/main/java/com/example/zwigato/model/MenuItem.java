package com.example.zwigato.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column
    private int price;

    @Column
    @Enumerated(EnumType.STRING)
    private FoodCategory category;

    @Column
    private boolean isVeg;

    List<OrderItem> orderItems;

    private List<Restaurant> restaurants;
}
