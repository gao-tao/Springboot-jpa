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
@Entity(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "brand_name")
    private String brandName;

    @JoinColumn(name = "brand_status")
    private int status;
}
