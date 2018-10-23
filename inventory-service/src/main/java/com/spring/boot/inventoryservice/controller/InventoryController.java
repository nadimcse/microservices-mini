package com.spring.boot.inventoryservice.controller;

import com.spring.boot.inventoryservice.model.InventoryItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ns185174 on 10/20/18.
 */

@RestController
@Slf4j
public class InventoryController {

    @GetMapping("/inventory/{productCode}")
    public ResponseEntity<InventoryItem> findInventoryByProductCode(@PathVariable("productCode") String productCode) {
        log.info("Finding inventory for product code :" + productCode);

        final InventoryItem inventoryItem = new InventoryItem(productCode, 2);

        return new ResponseEntity<>(inventoryItem, HttpStatus.OK);
    }
}
