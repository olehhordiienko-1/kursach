package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;


public interface PetShopRepository extends CrudRepository<PetShop, Integer> { }