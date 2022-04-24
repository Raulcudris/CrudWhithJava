package com.example.Crud_Spring_Boot.Services;
import java.util.List;
import com.example.Crud_Spring_Boot.models.product;


public interface productServices{

    public product save(product product);
    public void delete(Integer id);
    public product findById(Integer id);
    public List <product> findAll();
}