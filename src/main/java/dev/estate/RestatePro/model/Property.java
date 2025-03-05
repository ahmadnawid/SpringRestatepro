package dev.estate.RestatePro.model;

import jakarta.persistence.*;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String location;
    private String imageUrl;

    @ManyToOne
    private User owner;
}
