package org.datayoo.brackets.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class StorageIndex {
    @ApiModelProperty(value = "索引名称", required = true, example = "FK_4kylx615r5j7sfyrbfvbhvixi", notes = "索引名称")
    private String indexName;
    @ApiModelProperty(value = "列集名称", required = true, example = "res_id", notes = "列集名称")
    private String columnName;
    @ApiModelProperty(value = "索引类型", required = true, example = "BTREE", notes = "索引类型")
    private String indexType;


    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }
}
