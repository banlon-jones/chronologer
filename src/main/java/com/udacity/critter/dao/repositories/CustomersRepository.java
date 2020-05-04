package com.udacity.critter.dao.repositories;

import com.udacity.critter.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer, Long> {
}
