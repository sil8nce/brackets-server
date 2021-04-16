package org.datayoo.brackets.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

@ApiModel
public class StorageProperties {

    @ApiModelProperty( value = "Hive表存储格式" )
    private String stored;

    @ApiModelProperty( value = "Hive表row format属性" )
    private  String rowFormat;

    @ApiModelProperty( value = "Hive表路径" )
    private String location;

    @ApiModelProperty( value = "Hive表自定义属性" )
    private Map tblproperties;

    @ApiModelProperty( value = "ES分片数" )
    private String shards;

    @ApiModelProperty( value = "ES副本数" )
    private String replicas;

    public String getStored() {
        return stored;
    }

    public void setStored(String stored) {
        this.stored = stored;
    }

    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map getTblproperties() {
        return tblproperties;
    }

    public void setTblproperties(Map tblproperties) {
        this.tblproperties = tblproperties;
    }

    public String getShards() { return shards; }

    public void setShards(String shards) { this.shards = shards; }

    public String getReplicas() { return replicas; }

    public void setReplicas(String replicas) { this.replicas = replicas; }


}
