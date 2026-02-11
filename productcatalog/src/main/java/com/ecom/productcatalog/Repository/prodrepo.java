package com.ecom.productcatalog.Repository;

import com.ecom.productcatalog.model.category;
import com.ecom.productcatalog.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface prodrepo extends JpaRepository<product,Long> {
    List<product> findByCategoryId(Long categoryId); // in repo we not beed to write the public  because it came with public abstract
}
// jujst by reading find  assume in mmind select * from the repo name (in th repo )  and reading by maens where clause and categoryId means the column and in the bracket is the id or etc we are looking for in that column