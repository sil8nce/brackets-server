package org.datayoo.brackets.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.datayoo.brackets.domain.BracketSourceCategory;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName DataSourceQueryDto
 * @Description TODO
 * @Author BLADE
 * @Date 4/14/2021 5:18 PM
 * @Version 1.0
 **/
@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSourceQueryDto implements Serializable {

  private static final long serialVersionUID = 1L;
  /**
   * 数据库类型
   */
  @ApiModelProperty(value = "数据库类型", example = "MYSQL", notes = "数据库类型")
  private DatabaseSourceType databaseSourceType;

  /**
   * 数据源类型
   */
  @ApiModelProperty(value = "数据源类型", example = "DATABASE", notes = "数据源类型")
  private BracketSourceCategory bracketSourceCategory;

  /**
   * 数据源标签
   */
  @ApiModelProperty(value = "数据源标签id", notes = "数据源标签id")
  private Set<String> tag = new HashSet<>();

  public DatabaseSourceType getDatabaseSourceType() {
    return databaseSourceType;
  }

  public void setDatabaseSourceType(DatabaseSourceType databaseSourceType) {
    this.databaseSourceType = databaseSourceType;
  }

  public BracketSourceCategory getBracketSourceCategory() {
    return bracketSourceCategory;
  }

  public void setBracketSourceCategory(
      BracketSourceCategory bracketSourceCategory) {
    this.bracketSourceCategory = bracketSourceCategory;
  }

  public Set<String> getTag() {
    return tag;
  }

  public void setTag(Set<String> tag) {
    this.tag = tag;
  }
}
