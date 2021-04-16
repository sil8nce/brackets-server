package org.datayoo.brackets.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.datayoo.base.types.DataTypeName;

@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class StorageColumn implements Comparable<StorageColumn> {

  private String uri;

  @ApiModelProperty(hidden = true)
  private String id;

  @ApiModelProperty(value = "字段名", example = "id")
  private String name;

  @ApiModelProperty(value = "是否主键", example = "true")
  private boolean isKey = false;

  @ApiModelProperty(value = "是否为分区字段", example = "false")
  private boolean isPartitionField = false;

  @ApiModelProperty(value = "是否允许为空", example = "true")
  private boolean nullable = true;

  @ApiModelProperty(value = "数据类型")
  private DataTypeName dataType;

  @ApiModelProperty(value = "数据大小")
  private int size;

  @ApiModelProperty(hidden = true)
  private String format;

  @ApiModelProperty(value = "数据大小")
  private int precision;

  @ApiModelProperty(value = "Precision的取值范围为1---38")
  private int scale;

  @ApiModelProperty(value = "Scale的取值范围为-84---127")
  private String defaultValue;

  @ApiModelProperty(value = "原始数据类型", example = "varchar")
  private String originalType;

  @ApiModelProperty(value = "comment", example = "××")
  private String note;

  @ApiModelProperty(hidden = true)
  private Sensitivity sensitivity;

  @ApiModelProperty(hidden = true)
  @JsonIgnore
  private StorageEntity entity;

  @ApiModelProperty(value = "建表字段集顺序,从一开始", example = "1", hidden = true)
  private int ordinal;

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

  public boolean isKey() {
    return isKey;
  }

  public void setKey(boolean key) {
    isKey = key;
  }

  public boolean isPartitionField() {
    return isPartitionField;
  }

  public void setPartitionField(boolean partitionField) {
    isPartitionField = partitionField;
  }

  public boolean isNullable() {
    return nullable;
  }

  public void setNullable(boolean nullable) {
    this.nullable = nullable;
  }

  public DataTypeName getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeName dataType) {
    this.dataType = dataType;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public int getPrecision() {
    return precision;
  }

  public void setPrecision(int precision) {
    this.precision = precision;
  }

  public int getScale() {
    return scale;
  }

  public void setScale(int scale) {
    this.scale = scale;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public String getOriginalType() {
    return originalType;
  }

  public void setOriginalType(String originalType) {
    this.originalType = originalType;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Sensitivity getSensitivity() {
    return sensitivity;
  }

  public void setSensitivity(Sensitivity sensitivity) {
    this.sensitivity = sensitivity;
  }

  public StorageEntity getEntity() {
    return entity;
  }

  public void setEntity(StorageEntity entity) {
    this.entity = entity;
  }

  public int getOrdinal() {
    return ordinal;
  }

  public void setOrdinal(int ordinal) {
    this.ordinal = ordinal;
  }

  @Override
  public int hashCode() {
    return ordinal;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    } else if (!(obj instanceof StorageColumn)) {
      return false;
    } else {
      StorageColumn dst = (StorageColumn) obj;
      if (!compareTrue(this.getDefaultValue(), dst.getDefaultValue())) {
        return false;
      }
      if (!compareTrue(this.getOriginalType(), dst.getOriginalType())) {
        return false;
      }
      if (!compareTrue(this.getNote(), dst.getNote())) {
        return false;
      }
      if (!compareTrue(this.getName(), dst.getName())) {
        return false;
      }
      if (!(dst.isNullable() == this.isNullable())) {
        return false;
      } else if (!(dst.getDataType() == this.dataType)) {
        return false;
      } else if (!(dst.getSize() == this.size)) {
        return false;
      } else if (!(dst.getPrecision() == this.precision)) {
        return false;
      } else if (!(dst.isKey() == this.isKey)) {
        return false;
      } else if (!(dst.isPartitionField() == this.isPartitionField)) {
        return false;
      }
      return true;
    }
  }

  private boolean compareTrue(String src, String des) {
    if (src == null && des == null) {
      return true;
    }
    if (src != null) {
      if (src.equals(des)) {
        return true;
      }
    }
    if (des != null) {
      if (des.equals(src)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int compareTo(StorageColumn o) {
    return this.name.compareToIgnoreCase(o.getName());
  }

}
