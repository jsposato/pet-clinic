package com.sposato.petclinicdata.services;

import com.sposato.petclinicdata.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
