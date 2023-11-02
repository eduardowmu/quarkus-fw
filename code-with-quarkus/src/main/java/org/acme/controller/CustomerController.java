package org.acme.controller;

import org.acme.model.Customer;
import org.acme.service.CustomerService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/api/customer")
public class CustomerController {
    @Inject
    CustomerService customerService;

    @GET
    public List<Customer> listAll() {
        return this.customerService.list();
    }

    @POST
    public void saveCustomer(Customer customer) {
        this.customerService.saveCustomer(customer);
    }
}