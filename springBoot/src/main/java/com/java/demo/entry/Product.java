package com.java.demo.entry;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by GaoTao on 2017/12/28.
 */
@Data
@Table
@EqualsAndHashCode
@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "prod_name")
    private String prodName;

    @JoinColumn(name = "prod_price")
    private String price;

    @JoinColumn(name = "prod_des")
    private String prodDes;

    @JoinColumn(name = "prod_status")
    private String status;

    @OneToOne
    @JoinColumn(name = "prod_brand_id")
    private Brand brand;


}
