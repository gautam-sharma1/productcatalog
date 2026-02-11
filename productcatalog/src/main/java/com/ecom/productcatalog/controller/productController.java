package com.ecom.productcatalog.controller;

import com.ecom.productcatalog.model.product;
import com.ecom.productcatalog.service.prodser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class productController {
private prodser prods;
productController(prodser prods) {
    this.prods = prods;
}
    @GetMapping
    public List<product> getAllprod(){
       return prods.getAllProd();

}
@GetMapping("category/{categoryId}")
public List<product> getprodbycat(@PathVariable Long categoryId){
    return prods.getProdbyCategoryid(categoryId);
}

}
