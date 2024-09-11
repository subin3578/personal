package com.farmstory.dto;

import com.farmstory.entity.product.Product;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.annotation.processing.Generated;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class ProductDTO {

    private int prodNo;
    private String prodName;
    private String type;
    private int price;
    private int discount;
    private int deliveryfee;
    private int stock;
    private String img1;
    private String img2;
    private String img3;
    private String regdate;
    private String etc;

    private String uid;



    public Product toEntity(){
        return Product.builder()
                .prodNo(prodNo)
                .prodName(prodName)
                .type(type)
                .price(price)
                .discount(discount)
                .deliveryfee(deliveryfee)
                .stock(stock)
                .img1(img1)
                .img2(img2)
                .img3(img3)
                .regdate(regdate)
                .etc(etc)
                .uid(uid)
                .build();
    }
}
