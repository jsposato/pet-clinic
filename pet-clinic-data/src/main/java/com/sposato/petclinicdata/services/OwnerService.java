package com.sposato.petclinicdata.services;

import com.sposato.petclinicdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
