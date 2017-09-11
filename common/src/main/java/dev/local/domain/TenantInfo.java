package dev.local.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class TenantInfo {
    @DBRef
    private String tenantId;
    private byte[] BusinessLicense;
    @DBRef
    private LegalEntity legalEntity;
}
