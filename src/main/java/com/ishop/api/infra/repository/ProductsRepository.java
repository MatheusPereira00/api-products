package com.ishop.api.infra.repository;

import com.ishop.api.domain.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
