package com.spring.rucken.dto;

import java.util.Set;

public class AccountDto extends UserDto  {
    private Set<GroupWithPermissionsDto> groupWithPermissionsDtos;

    public AccountDto() {
    }

// TODO: 31.07.2018 косяк! 
//    public Set<GroupWithPermissionsDto> getGroupWithPermissionsDtos() {
//        return groupWithPermissionsDtos;
//    }
//
//    public void setGroupWithPermissionsDtos(Set<GroupWithPermissionsDto> groupWithPermissionsDtos) {
//        this.groupWithPermissionsDtos = groupWithPermissionsDtos;
//    }
}
