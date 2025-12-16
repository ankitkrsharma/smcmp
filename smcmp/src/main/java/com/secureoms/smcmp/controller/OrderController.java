package com.secureoms.smcmp.controller;

import com.secureoms.smcmp.entity.Order;
import com.secureoms.smcmp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    // Create order
    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.createOrder(order));
    }

    // Get orders by tenant
    @GetMapping("/tenant/{tenantId}")
    public ResponseEntity<List<Order>> getOrdersByTenant(@PathVariable Long tenantId) {
        return ResponseEntity.ok(orderService.getOrdersByTenant(tenantId));
    }
}
