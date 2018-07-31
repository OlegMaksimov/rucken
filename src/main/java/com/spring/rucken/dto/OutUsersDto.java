package com.spring.rucken.dto;

import java.util.Set;

public class OutUsersDto {
    private Set<UserDto> users;
    private MetaDto meta;

    public OutUsersDto() {
    }

    public Set<UserDto> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDto> users) {
        this.users = users;
    }

    public MetaDto getMeta() {
        return meta;
    }

    public void setMeta(MetaDto meta) {
        this.meta = meta;
    }
}
