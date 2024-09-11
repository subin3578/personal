package com.farmstory.repository;

import com.farmstory.entity.product.Product;
import com.farmstory.repository.custom.ProductRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>, ProductRepositoryCustom {

}