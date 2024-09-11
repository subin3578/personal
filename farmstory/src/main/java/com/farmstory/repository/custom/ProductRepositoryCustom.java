package com.farmstory.repository.custom;

import com.farmstory.entity.product.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductRepositoryCustom {

    public List<Product> selectProducts();
    public Product selectProduct(int prodNo);

}