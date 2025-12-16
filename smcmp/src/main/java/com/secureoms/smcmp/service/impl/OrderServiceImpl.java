package com.secureoms.smcmp.service.impl;

import com.secureoms.smcmp.entity.Order;
import com.secureoms.smcmp.repository.OrderRepository;
import com.secureoms.smcmp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public List<Order> getOrdersByTenant(Long tenantId) {
        return orderRepository.findByTenantId(tenantId);
    }

    // @Override
    // public Order updateOrder(Long id, Order order) {
    //     Order existing = getOrderById(id);
    //     existing.setStatus(order.getStatus());
    //     existing.setTotalAmount(order.getTotalAmount());
    //     return orderRepository.save(existing);
    // }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
