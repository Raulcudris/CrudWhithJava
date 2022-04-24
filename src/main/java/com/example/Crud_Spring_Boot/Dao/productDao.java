package com.example.Crud_Spring_Boot.Dao;
import com.example.Crud_Spring_Boot.models.product;
import org.springframework.data.repository.CrudRepository;

public interface productDao extends CrudRepository<product, Integer> {
    

}