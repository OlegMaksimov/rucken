package com.spring.rucken.dto;

public class OutPermissionDto {
    private PermissionDto permission;
    private MetaDto meta;

    public OutPermissionDto() {
    }

    public PermissionDto getPermission() {
        return permission;
    }

    public void setPermission(PermissionDto permission) {
        this.permission = permission;
    }

    public MetaDto getMeta() {
        return meta;
    }

    public void setMeta(MetaDto meta) {
        this.meta = meta;
    }
}
