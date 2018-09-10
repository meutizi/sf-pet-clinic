package com.me.sfpetclinic.services.map;

import java.util.Set;

import com.me.sfpetclinic.model.Owner;
import com.me.sfpetclinic.services.CrudService;
import com.me.sfpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	public OwnerServiceMap() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}
	

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
