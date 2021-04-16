package org.datayoo.brackets.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class StorageTag {
    @ApiModelProperty(hidden = true)
    private String id;

    @ApiModelProperty(hidden = true)
    private String name;

    @ApiModelProperty(hidden = true)
    private String type;

    @ApiModelProperty(hidden = true)
    private String descr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
