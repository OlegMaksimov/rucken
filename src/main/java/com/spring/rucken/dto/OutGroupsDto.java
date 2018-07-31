package com.spring.rucken.dto;

import java.util.Set;

public class OutGroupsDto {

    private Set<GroupWithPermissionsDto> groups;
    private MetaDto meta;

    public OutGroupsDto() {
    }

    public Set<GroupWithPermissionsDto> getGroups() {
        return groups;
    }

    public void setGroups(Set<GroupWithPermissionsDto> groups) {
        this.groups = groups;
    }

    public MetaDto getMeta() {
        return meta;
    }

    public void setMeta(MetaDto meta) {
        this.meta = meta;
    }
}
