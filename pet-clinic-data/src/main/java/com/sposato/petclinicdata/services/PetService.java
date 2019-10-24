package com.sposato.petclinicdata.services;

import com.sposato.petclinicdata.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
