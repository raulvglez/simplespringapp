package com.solera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solera.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>  {

}
