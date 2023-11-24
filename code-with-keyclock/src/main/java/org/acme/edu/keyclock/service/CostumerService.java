package org.acme.edu.keyclock.service;

import org.acme.edu.keyclock.model.Costumer;
import org.acme.edu.keyclock.repository.CostumerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CostumerService {
    @Inject
    private CostumerRepository costumerRepository;

    public List<Costumer> findAllCostumers() {
        return  this.costumerRepository.findAll().list();
    }

    public void save(Costumer costumer) {
        this.costumerRepository.persist(costumer);
    }
}