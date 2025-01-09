package com.vitordev.course.repositories;

import com.vitordev.course.entities.Category;
import com.vitordev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
