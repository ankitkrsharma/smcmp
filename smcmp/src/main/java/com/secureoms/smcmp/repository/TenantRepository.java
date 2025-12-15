package com.secureoms.smcmp.repository;

import com.secureoms.smcmp.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {

    boolean existsByName(String name);
}
