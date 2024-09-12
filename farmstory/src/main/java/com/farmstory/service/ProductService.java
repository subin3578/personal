package com.farmstory.service;

import ch.qos.logback.classic.Logger;
import com.farmstory.dto.ProductDTO;
import com.farmstory.entity.product.Product;
import com.farmstory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Log4j2
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    public static String uploadDir = "/private/var/folders/sw/ybshp0b52h11w7kw3blrbz240000gn/T/tomcat.8081.7979731255351636581/work/Tomcat/localhost/farmstory/uploads/";

    public void insertProduct(ProductDTO productDTO, MultipartFile image) {
        // 일단 MultipartFile()을 통해서 가져와는지 확인봐야함
        // 파일 업로드가 되는지 확인
        log.info(MultipartFile.class.toString());
        // 최대 3개의 이미지를 처리
        if (image != null && !image.isEmpty()) {

            // 고유한 파일 이름 생성
            String oName = image.getOriginalFilename();
            String sName = UUID.randomUUID().toString() + "_" + oName;

            // 파일 저장
            File destFile = new File(uploadDir + sName);
            try {
                image.transferTo(destFile); // 파일 저장
            } catch (IOException e) {
                e.printStackTrace();
            }

            // 이미지 파일 이름 저장
            productDTO.setImg1(destFile.getName());
        }

        Product entity = productDTO.toEntity();
        productRepository.save(entity);
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

