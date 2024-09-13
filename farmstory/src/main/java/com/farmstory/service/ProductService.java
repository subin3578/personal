package com.farmstory.service;

import com.farmstory.dto.ProductDTO;
import com.farmstory.entity.Product;
import com.farmstory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Log4j2
@RequiredArgsConstructor
@Service

public class ProductService {

    private final ProductRepository productRepository;
    public static String uploadDir = "C:\\Users\\lotte4\\Desktop\\Spring\\uploads\\MainImage\\";
  // public static String uploadDir = "/uploads/";
    @Transactional
    public void insertProduct(ProductDTO productDTO,MultipartFile image) {
        log.info(uploadDir);


        if (image != null && !image.isEmpty()) {
            // 고유한 파일 이름 생성
            String oName = image.getOriginalFilename();
            String sName = UUID.randomUUID().toString() + "_" + oName;

            // 파일 저장
            File destFile = new File(uploadDir + sName);
            String path = destFile.getAbsolutePath();
            log.info(destFile);

            try {
                log.info("ProductService > 파일 저장 before");
                image.transferTo(destFile); // 파일을 저장
                log.info(destFile);
                log.info("ProductService > 파일 저장 after");
            } catch (IOException e) {
                System.out.println("Fail Upload File"); // 예외 처리
                log.info("ProductService > 파일 저장 error");
                e.printStackTrace();
                // 예외 발생 시 로깅 또는 추가 처리 필요
            }

            // 이미지 파일 이름 저장
            productDTO.setImg1(sName);
        }

        Product entity = productDTO.toEntity();
        productRepository.save(entity);

        log.info("ProductService > insertProduct end");
    }
    public List<ProductDTO> selectProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOs = new ArrayList<>();
        for (Product product : products) {
            productDTOs.add(product.toDTO());
        }
        return productDTOs;
    }
}

