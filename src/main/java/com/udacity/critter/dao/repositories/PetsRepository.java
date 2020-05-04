package com.udacity.critter.dao.repositories;

import com.udacity.critter.dao.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetsRepository extends JpaRepository<Pet, Long> {

    List<Pet> getAllByCustomerId(Long customerId);

}
