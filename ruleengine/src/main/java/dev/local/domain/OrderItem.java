package dev.local.domain;

import lombok.Data;

@Data
public class OrderItem {
    private String id;
    private InventoryItem product;
    private float amount;
    private float salePrice;
    private Staff soldBy;
    private int status;
}
