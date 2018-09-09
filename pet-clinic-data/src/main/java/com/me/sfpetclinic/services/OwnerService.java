package com.me.sfpetclinic.services;

import com.me.sfpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}