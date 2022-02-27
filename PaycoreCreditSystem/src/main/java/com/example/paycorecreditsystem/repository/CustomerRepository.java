package com.example.paycorecreditsystem.repository;

import com.example.paycorecreditsystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsByUsername(String username);

    Customer findByUsername(String username);

    void deleteByUsername(String username);

}

