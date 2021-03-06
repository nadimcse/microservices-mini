package com.spring.boot.catalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ns185174 on 10/20/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {


    private String code;
    private String name;
    private String description;
    private double price;

}
