package com.example.paycorecreditsystem.controller;

import com.example.paycorecreditsystem.model.Customer;
import com.example.paycorecreditsystem.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

    @Validated
    @RestController
    @RequestMapping("/users")
    public class CustomerController {
        @Autowired
        private CustomerService userService;

        @DeleteMapping(value = "/{name}")
        public String deleteName(@PathVariable String name) {
            userService.delete(name);
            return name;
        }

        @DeleteMapping(value = "/{surname}")
        public String deleteSurname(@PathVariable String surname) {
            userService.delete(surname);
            return surname;
        }

}
