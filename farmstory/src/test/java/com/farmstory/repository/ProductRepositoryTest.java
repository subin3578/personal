package com.farmstory.repository;

import com.farmstory.entity.Cart;
import com.farmstory.entity.Product;
import com.farmstory.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void selectProducts() {
        List<Product> products = productRepository.findAll();
        System.out.println("---------------------------products----------------------------");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Test
    public void insertCart(){
        User user1 = User.builder()
                .uid("A111")
                .nick("황소")
                .build();

        User user2 = User.builder().uid("A102").nick("참새").build();
        userRepository.save(user2);
        Product product = Product.builder()
                .prodNo(141)
                .prodName("콘칩")
                .build();
        productRepository.save(product);

        Cart cart = Cart.builder()
                .product(product)
                .user(user1)
                .build();
        Cart cart2 = Cart.builder()
                .product(product)
                .user(user2)
                .build();
        cartRepository.save(cart);
        cartRepository.save(cart2);
    }
}
