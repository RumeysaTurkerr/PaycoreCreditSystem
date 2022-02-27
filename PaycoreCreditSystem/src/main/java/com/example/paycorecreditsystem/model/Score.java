package com.example.paycorecreditsystem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "customerId can not be null")
    private Integer customerId;

    @NotNull(message = "creditScore can not be null")
    private String creditScore;


    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private Customer customer;
}
