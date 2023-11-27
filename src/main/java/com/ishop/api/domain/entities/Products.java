package com.ishop.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name= "tb_products")
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable= false, length = 45)
    private String name;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false)
    private Integer sku;

    @Column
    private Date creation_date;

    @Column(nullable=false)
    private Double unitary_value;

    @Column(nullable=false)
    private BigDecimal stock;

    @Column(nullable=false)
    private Boolean active;

}
