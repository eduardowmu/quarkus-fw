package org.acme.edu.keyclock.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.edu.keyclock.model.Costumer;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CostumerRepository implements PanacheRepository<Costumer> {
}