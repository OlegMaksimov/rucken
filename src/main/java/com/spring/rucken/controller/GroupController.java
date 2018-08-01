package com.spring.rucken.controller;

import com.spring.rucken.entity.Group;
import com.spring.rucken.entity.User;
import com.spring.rucken.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class GroupController {

    private final Logger log = LoggerFactory.getLogger(GroupController.class);

    @Autowired
    GroupService groupService;

    @PostMapping("/groups")
    public Group createGroup(@RequestBody Group group){
        log.debug("create group {}",group);
        Group result = groupService.createGroup(group);
        return result;
    }

    @PutMapping("/groups")
    public Group updateGroup(@RequestBody Group group){
        log.debug("update group {}",group);
        Group result = groupService.createGroup(group);
        return result;
    }

    @GetMapping("/groups/{id}")
    public Group load(@RequestBody Long id){
        log.debug("load group {}",id);
        Group result = groupService.loadGroup(id);
        return result;
    }

    @DeleteMapping("/groups/{id}")
    public void delete(@RequestBody Long id){
        log.debug("delete group {}",id);
        groupService.deleteGroup(id);
    }

}
