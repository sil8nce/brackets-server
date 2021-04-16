package org.datayoo.brackets.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class SqlQueryDto {
  @ApiModelProperty(value = "分页数")
  private Integer requestSize;

  @ApiModelProperty(value = "查询sql", required = true)
  private String sql;

  public Integer getRequestSize() {
    return requestSize;
  }

  public void setRequestSize(Integer requestSize) {
    this.requestSize = requestSize;
  }

  public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }
}