package com.udacity.critter.dao.repositories;

import com.udacity.critter.dao.entities.Employee;
import com.udacity.critter.dao.entities.Pet;
import com.udacity.critter.dao.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchedulesRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> getAllByPetsContains(Pet pet);

    List<Schedule> getAllByEmployeesContains(Employee employee);

    List<Schedule> getAllByPetsIn(List<Pet> pets);
}
