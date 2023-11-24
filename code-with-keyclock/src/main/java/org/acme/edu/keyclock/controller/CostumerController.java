package org.acme.edu.keyclock.controller;

import org.acme.edu.keyclock.model.Costumer;
import org.acme.edu.keyclock.service.CostumerService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/api/costumer")
public class CostumerController {
    @Inject
    private CostumerService costumerService;

    @GET
    @RolesAllowed("manager")
    public List<Costumer> listAll() {
        List<Costumer> costumers = new ArrayList<>();

        try {
            costumers = costumerService.findAllCostumers();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }

        return costumers;
    }

    @POST
    @Transactional
    @RolesAllowed("manager")
    public void save(Costumer costumer) {
        this.costumerService.save(costumer);
    }
}