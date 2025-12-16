package com.secureoms.smcmp.service;

import com.secureoms.smcmp.entity.Tenant;

import java.util.List;

public interface TenantService {

    Tenant createTenant(Tenant tenant);

    Tenant getTenantById(Long id);

    List<Tenant> getAllTenants();

    void deactivateTenant(Long id);
}
