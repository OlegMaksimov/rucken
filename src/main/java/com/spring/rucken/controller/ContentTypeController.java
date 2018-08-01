package com.spring.rucken.controller;

import com.spring.rucken.entity.ContentType;
import com.spring.rucken.entity.User;
import com.spring.rucken.service.ContentTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ContentTypeController {

    private final Logger log = LoggerFactory.getLogger(ContentTypeController.class);

    @Autowired
    ContentTypeService contentTypeService;

    @PostMapping("/content_types")
    public ContentType createUser(@RequestBody ContentType contentType){
        log.debug("create contentType {}",contentType);
        ContentType result = contentTypeService.createContentType(contentType);
        return result;
    }

    @PutMapping("/content_types")
    public ContentType updateUser(@RequestBody ContentType contentType){
        log.debug("update contentType {}",contentType);
        ContentType result = contentTypeService.createContentType(contentType);
        return result;
    }

    @GetMapping("/content_types/{id}")
    public ContentType load(@RequestBody Long id){
        log.debug("load contentType {}",id);
        ContentType result = contentTypeService.loadContentType(id);
        return result;
    }

    @DeleteMapping("/content_types/{id}")
    public void delete(@RequestBody Long id){
        log.debug("delete contentType {}",id);
        contentTypeService.deletecontentType(id);
    }

}
