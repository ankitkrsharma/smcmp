package com.secureoms.smcmp.service;

import com.secureoms.smcmp.entity.Order;
import java.util.List;

public interface OrderService {

    Order createOrder(Order order);

    Order getOrderById(Long id);

    List<Order> getOrdersByTenant(Long tenantId);
    
    List<Order> getAllOrders();

    // Order updateOrder(Long id, Order order);

    void deleteOrder(Long id);
}