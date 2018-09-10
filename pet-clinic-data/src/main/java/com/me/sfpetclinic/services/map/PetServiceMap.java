package com.me.sfpetclinic.services.map;

import java.util.Set;

import com.me.sfpetclinic.model.Pet;
import com.me.sfpetclinic.services.CrudService;
import com.me.sfpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	public PetServiceMap() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
}
