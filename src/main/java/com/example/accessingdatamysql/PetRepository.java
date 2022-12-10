package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;


public interface PetRepository extends CrudRepository<Pet, Integer> { }