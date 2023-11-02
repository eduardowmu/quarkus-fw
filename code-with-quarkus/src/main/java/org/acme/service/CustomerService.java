package org.acme.service;

import org.acme.model.Customer;
import org.acme.repository.CustomerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CustomerService {
    @Inject
    CustomerRepository customerRepository;

    public List<Customer> list() {
        try {
            return this.customerRepository.findAll().list();
        } catch(RuntimeException e) {
            throw e;
        }
    }

    @Transactional//serve para nos permitir que realizemos alteração na base
    public void saveCustomer(Customer customer) {
        this.customerRepository.persist(customer);
    }
}