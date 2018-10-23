package com.spring.boot.inventoryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ns185174 on 10/20/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItem {

    private String productCode;
    private Integer availableQuantity = 0;
}
