package com.spring.rucken.dto;

public class InPermissionDto {
    private Long id;
    private String name;
    private String title;
    private ContentTypeDto contentType;

    public InPermissionDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ContentTypeDto getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeDto contentType) {
        this.contentType = contentType;
    }
}
