package com.example.LaptopService.reviwe;
	
import jakarta.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String message;
    private int rating;

    // getters & setters
}
