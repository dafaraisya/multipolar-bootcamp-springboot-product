package com.multipolar.bootcamp.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @GetMapping("/products")
    public ResponseEntity<List<Product>> todos() {
        List<Product> productList = List.of(
                new Product(1, "Baju"),
                new Product(2, "Celana"),
                new Product(3, "Topi")
        );

        return ResponseEntity.ok(productList);
    }
}
