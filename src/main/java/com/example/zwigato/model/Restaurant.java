package com.example.zwigato.model;

import jakarta.persistence.*;
import lombok.*;

import java.awt.MenuItem;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Restaurant {

    @Id
    private int id;

    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;
}
