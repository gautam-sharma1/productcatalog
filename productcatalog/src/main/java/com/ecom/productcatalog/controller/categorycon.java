package com.ecom.productcatalog.controller;

import com.ecom.productcatalog.model.category;
import com.ecom.productcatalog.service.categoryserv;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class categorycon {
    private final  categoryserv category;
    categorycon(categoryserv category){
        this.category=category;
    }
  @GetMapping
    public List<category> getAllCategory(){
       return category.getAllcategory();
    }

}
