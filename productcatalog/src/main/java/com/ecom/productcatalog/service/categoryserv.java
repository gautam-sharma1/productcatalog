package com.ecom.productcatalog.service;

import com.ecom.productcatalog.Repository.categoryrepo;
import com.ecom.productcatalog.model.category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class categoryserv {
    private final  categoryrepo catrep;
    categoryserv(categoryrepo catrep){
        this.catrep=catrep;
    }
    public List<category> getAllcategory() {
     return catrep.findAll();
    }
}
