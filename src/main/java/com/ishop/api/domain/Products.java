package com.ishop.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "tb_products")
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;

    @Column(nullable= false, length = 45)
    private String name_product;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false)
    private Integer sku;

    @Column
    private String creation_date;

    @Column(nullable=false)
    private Double unitary_value;

    @Column(nullable=false)
    private Integer stock;

    @Column(nullable=false)
    private Integer active;

}
