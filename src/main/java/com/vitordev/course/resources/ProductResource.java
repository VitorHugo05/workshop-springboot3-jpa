package com.vitordev.course.resources;

import com.vitordev.course.entities.Category;
import com.vitordev.course.entities.Product;
import com.vitordev.course.services.CategoryServices;
import com.vitordev.course.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductServices productServices;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> users = productServices.findAll();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = productServices.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
