package com.spring.rucken.service;

import com.spring.rucken.entity.Group;
import com.spring.rucken.entity.User;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    public Group createGroup(Group group){
        return group;
    }
    public Group loadGroup(Long id){
        return null;
    }
    public void deleteGroup(Long id){

    }


}
