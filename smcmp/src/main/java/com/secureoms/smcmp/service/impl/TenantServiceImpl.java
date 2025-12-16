package com.secureoms.smcmp.service.impl;

import com.secureoms.smcmp.entity.Tenant;
import com.secureoms.smcmp.repository.TenantRepository;
import com.secureoms.smcmp.service.TenantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {

    private final TenantRepository tenantRepository;

    public TenantServiceImpl(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    @Override
    public Tenant createTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public Tenant getTenantById(Long id) {
        return tenantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tenant not found"));
    }

    @Override
    public List<Tenant> getAllTenants() {
        return tenantRepository.findAll();
    }

    @Override
    public void deactivateTenant(Long id) {
        Tenant tenant = getTenantById(id);
        tenant.setActive(false);
        tenantRepository.save(tenant);
    }
}
