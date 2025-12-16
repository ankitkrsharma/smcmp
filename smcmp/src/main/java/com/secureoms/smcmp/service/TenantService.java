package com.secureoms.smcmp.service;

import com.secureoms.smcmp.entity.Tenant;

public interface TenantService {

    Tenant createTenant(Tenant tenant);

    Tenant getTenantById(Long id);
}
