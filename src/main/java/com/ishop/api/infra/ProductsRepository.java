package com.ishop.api.infra;

import com.ishop.api.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
