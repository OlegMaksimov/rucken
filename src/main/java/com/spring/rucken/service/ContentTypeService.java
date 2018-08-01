package com.spring.rucken.service;

import com.spring.rucken.entity.ContentType;
import com.spring.rucken.entity.Group;
import org.springframework.stereotype.Service;

@Service
public class ContentTypeService {

    public ContentType createContentType(ContentType contentType){
        return contentType;
    }
    public ContentType loadContentType(Long id){
        return null;
    }
    public void deletecontentType(Long id){

    }


}
