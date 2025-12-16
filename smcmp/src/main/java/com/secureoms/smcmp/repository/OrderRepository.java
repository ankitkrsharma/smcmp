package com.secureoms.smcmp.repository;

import com.secureoms.smcmp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByTenantId(Long tenantId);
}
