package com.example.paycorecreditsystem.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
    @Data
    @Entity
    public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Size(min = 5, max = 25, message = "name length should be between 5 and 25 characters")
        @Column(unique = true, nullable = false)
        private String name;
        @Size(min = 5, max = 25, message = "surname length should be between 5 and 25 characters")
        @Column(unique = true, nullable = false)
        private String surname;

        @Column(unique = true, nullable = false)
        private String nationalIdentificationNumber;

        @NotNull(message = "monthlyIncome can not be null")
        private Integer monthlyIncome;

        @Column(unique = true, nullable = false)
        private String phoneNumber;
}
