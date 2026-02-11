package com.ecom.productcatalog.service;

import com.ecom.productcatalog.Repository.prodrepo;
import com.ecom.productcatalog.model.product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class prodser {
    private final prodrepo prodr;
    prodser(prodrepo prodr){
        this.prodr=prodr;
    }
    public List<product> getAllProd() {
      return  prodr.findAll();
    }
    public List<product> getProdbyCategoryid(Long categoryId){
        return prodr.findByCategoryId(categoryId); // jujst by reading find  assume in mmind select * from the repo name (in th repo )  and reading by maens where clause and categoryId means the column and in the bracket is the id or etc we are looking for in that column
    }

}
