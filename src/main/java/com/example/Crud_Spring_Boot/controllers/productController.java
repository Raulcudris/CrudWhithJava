package com.example.Crud_Spring_Boot.controllers;
import java.util.List;
import com.example.Crud_Spring_Boot.Services.productServices;
import com.example.Crud_Spring_Boot.models.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class productController {
    
    @Autowired
    private productServices productServices;
    @PostMapping("/products")
    public product save(@RequestBody product product){
        return productServices.save(product);
    }

    @GetMapping("/products")
    public List<product> Products(){
        return productServices.findAll();
    }

    @GetMapping("/products/{id}")
    public product get(@PathVariable Integer id) {
        return productServices.findById(id);
    }

    @PutMapping("/products/{id}")
    public product update(@RequestBody product product, @PathVariable Integer id){
        product productConcurre = productServices.findById(id);
        productConcurre.setNombre(product.getNombre());
        productConcurre.setDescripcion(product.getDescripcion());
        productConcurre.setPrecio(product.getPrecio());
        productConcurre.setStock(product.getStock());

        return productServices.save(productConcurre);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id){
        productServices.delete(id);
    }

    
}
