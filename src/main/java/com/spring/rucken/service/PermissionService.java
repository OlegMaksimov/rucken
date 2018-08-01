package com.spring.rucken.service;

import com.spring.rucken.entity.Permission;
import com.spring.rucken.entity.User;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {

    public Permission createPermission(Permission permission){
        return permission;
    }
    public Permission loadPermission(Long id){
        return null;
    }
    public void deletePermission(Long id){

    }


}
