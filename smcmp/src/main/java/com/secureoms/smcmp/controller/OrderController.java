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
        Order savedOrder = orderService.createOrder(order);
        return ResponseEntity.ok(savedOrder);
    }

    // Get all orders
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    // Get order by ID
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    // Get orders by tenant ID (MULTI-TENANCY CORE FEATURE)
    @GetMapping("/tenant/{tenantId}")
    public ResponseEntity<List<Order>> getOrdersByTenantId(@PathVariable Long tenantId) {
        return ResponseEntity.ok(orderService.getOrdersByTenant(tenantId));
    }
}
