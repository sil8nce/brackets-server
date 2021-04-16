package org.datayoo.brackets.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class StorageKey {
  @ApiModelProperty(value = "键的类型",
      required = true,
      example = "PRKEY,FOREIGNKEY",
      notes = "主键或者外键")
  private StorageKeyType storageKeyType;
  @ApiModelProperty(value = "约束名称",
      required = true,
      example = "FK_e7cyl5llx5p4rpnpdb2ek3lmu",
      notes = "主键或者外键")
  private String name;
  @ApiModelProperty(value = "列集名称",
      required = true,
      example = "FK_e7cyl5llx5p4rpnpdb2ek3lmu",
      notes = "列集名称")
  private String columnName;
  @ApiModelProperty(value = "引用表模式",
      required = true,
      example = "pensieve",
      notes = "模式")
  private String referSchema;
  @ApiModelProperty(value = "引用表",
      required = true,
      example = "pens_data_source",
      notes = "表名")
  private String referTable;
  @ApiModelProperty(value = "引用列集",
      required = true,
      example = "res_id",
      notes = "引用列集")
  private String referColumn;

  public StorageKeyType getStorageKeyType() {
    return storageKeyType;
  }

  public void setStorageKeyType(StorageKeyType storageKeyType) {
    this.storageKeyType = storageKeyType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public String getReferSchema() {
    return referSchema;
  }

  public void setReferSchema(String referSchema) {
    this.referSchema = referSchema;
  }

  public String getReferTable() {
    return referTable;
  }

  public void setReferTable(String referTable) {
    this.referTable = referTable;
  }

  public String getReferColumn() {
    return referColumn;
  }

  public void setReferColumn(String referColumn) {
    this.referColumn = referColumn;
  }
}
