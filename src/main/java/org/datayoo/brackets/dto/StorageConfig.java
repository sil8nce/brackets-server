package org.datayoo.brackets.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>User: Jessica Wu <p>Date: Mar 09, 2016 <p>Version: 1.0
 */
@ApiModel
public class StorageConfig {

    @ApiModelProperty(hidden = true)
    private String id;

    @ApiModelProperty(value = "配置文件名称", required = true, example = "core-site", notes = "唯一")
    private String name;

    @ApiModelProperty(hidden = true)
    private String url;

    @ApiModelProperty(hidden = true)
    private String confContext;

    @ApiModelProperty(value = "tags", required = true, example = "core-site")
    private String tags;

    @ApiModelProperty(hidden = true)
    private String  datasourceId;


    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getConfContext() {
        return confContext;
    }

    public void setConfContext(String confContext) {
        this.confContext = confContext;
    }
}
