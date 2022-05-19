package com.example.demo.repository;

import com.example.demo.entity.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void findAll(){
        //given
        ProductEntity product_1 = new ProductEntity();
        ProductEntity product_2 = new ProductEntity();
        ProductEntity product_3 = new ProductEntity();
        productRepository.save(product_1);
        productRepository.save(product_2);
        productRepository.save(product_3);
        // when
        List<ProductEntity> result = productRepository.findAll();
        // then
        assertEquals(result.size(),3);
    }

}