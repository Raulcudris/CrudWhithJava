package com.example.Crud_Spring_Boot.Services;
import java.util.List;
import com.example.Crud_Spring_Boot.Dao.productDao;
import com.example.Crud_Spring_Boot.models.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productServicesImplement implements productServices {
 
    @Autowired
    private productDao productDao;

    @Override
    public product save(product product) {
        // TODO Auto-generated method stub
        return productDao.save(product);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        productDao.deleteById(id);;        
    }

    @Override
    public product findById(Integer id) {
        // TODO Auto-generated method stub
        return productDao.findById(id).orElse(null);
    }

    @Override
    public List<product> findAll() {
        // TODO Auto-generated method stub
        return (List<product>) productDao.findAll();
    }      
    
}
