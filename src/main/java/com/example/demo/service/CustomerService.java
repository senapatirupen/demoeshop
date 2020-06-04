package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
    public void registerNewCustomers() {
        Customer customer = new Customer();
        customer.setName("Rupen Senapati");
        customer.setEmail("senapati@example.com");
        customer.setPassword("password");
        customerRepository.saveAndFlush(customer);
    }
}

