package com.spring.rucken.controller;

import com.spring.rucken.entity.Permission;
import com.spring.rucken.entity.User;
import com.spring.rucken.service.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class PermissionController {

    private final Logger log = LoggerFactory.getLogger(PermissionController.class);

    @Autowired
    PermissionService permissionService;

    @PostMapping("/permissions")
    public Permission createPermission(@RequestBody Permission permission){
        log.debug("create permissions {}",permission);
        Permission result = permissionService.createPermission(permission);
        return result;
    }

    @PutMapping("/permissions")
    public Permission updatePermission(@RequestBody Permission permission){
        log.debug("update permissions {}",permission);
        Permission result = permissionService.createPermission(permission);
        return result;
    }

    @GetMapping("/permissions/{id}")
    public Permission load(@RequestBody Long id){
        log.debug("load permissions {}",id);
        Permission result = permissionService.loadPermission(id);
        return result;
    }

    @DeleteMapping("/permissions/{id}")
    public void delete(@RequestBody Long id){
        log.debug("delete permissions {}",id);
        permissionService.deletePermission(id);
    }

}
