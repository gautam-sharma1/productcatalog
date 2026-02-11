package com.ecom.productcatalog.Repository;

import com.ecom.productcatalog.model.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryrepo extends JpaRepository<category,Long> {
}
