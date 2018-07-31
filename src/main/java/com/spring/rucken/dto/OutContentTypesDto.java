package com.spring.rucken.dto;

import java.util.Set;

public class OutContentTypesDto {
    private Set<ContentTypeDto> contentTypes;
    private MetaDto meta;

    public OutContentTypesDto() {
    }

    public Set<ContentTypeDto> getContentTypes() {
        return contentTypes;
    }

    public void setContentTypes(Set<ContentTypeDto> contentTypes) {
        this.contentTypes = contentTypes;
    }

    public MetaDto getMeta() {
        return meta;
    }

    public void setMeta(MetaDto meta) {
        this.meta = meta;
    }
}
