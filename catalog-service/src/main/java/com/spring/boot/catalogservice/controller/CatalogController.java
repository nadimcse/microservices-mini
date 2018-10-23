package com.spring.boot.catalogservice.controller;

import com.spring.boot.catalogservice.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ns185174 on 10/20/18.
 */
@RestController
@RequestMapping("/catalog")
@Slf4j
public class CatalogController {

    @GetMapping("/{code}")
    public ResponseEntity<Product> productByCode(@PathVariable String code) {
        log.info("Finding product by code :" + code);

        final Product product = new Product(code, "KOI", "Unknown", 12);
        return new ResponseEntity<>(product, HttpStatus.OK);

    }
}
