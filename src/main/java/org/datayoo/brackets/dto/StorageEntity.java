package org.datayoo.brackets.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.datayoo.brackets.domain.BracketSourceCategory;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Tang Taiding
 */
@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class StorageEntity implements Comparable<StorageEntity> {

  @ApiModelProperty(value = "数据实体Id", hidden = true)
  private String id;

  private String uri;

  @ApiModelProperty(value = "表名称", example = "test1")
  private String name;

  @ApiModelProperty(value = "数据源类型", example = "DATABASE")
  private BracketSourceCategory bracketSourceCategory;

  @ApiModelProperty(value = "是否同步", example = "true", notes = "是否同步创建")
  private boolean syncEntity = false;

  @ApiModelProperty(value = "表类型", example = "/TABLE", notes = "表类型")
  private String entityType;

  @ApiModelProperty(value = "生命周期", example = "30", notes = "按生命周期清理表数据")
  private Integer lifeCycle;

  @ApiModelProperty(value = "清理字段")
  private String cleanField;

  @ApiModelProperty(hidden = true)
  private String storagePath;

  @ApiModelProperty(value = "其他属性",
      example = "<partitionxml><columnname>BIRTHDAY</columnname><subpartition><columnname>AGE</columnname></subpartition></partitionxml>")
  private String storagePropsXml;

  @ApiModelProperty(value = "其他属性")
  private StorageProperties storagePropsJson;

  @ApiModelProperty(value = "Avro模板")
  private AvroSchema avroSchema;

  @ApiModelProperty(hidden = true)
  private long storageSize = 0;

  @ApiModelProperty(value = "查看ddl语句")
  private String ddl;

  @ApiModelProperty(value = "最大保留分区数")
  private int storageBlockResidualCount = -1;

  @ApiModelProperty(value = "列描述")
  private Set<StorageColumn> storageColumns = new HashSet<StorageColumn>();

  @ApiModelProperty(hidden = true)

  private Set<StorageIndex> indexes = new HashSet<StorageIndex>();

  @ApiModelProperty(hidden = true, notes = "主键")

  private Set<StorageKey> pKeys = new HashSet<StorageKey>();

  @ApiModelProperty(hidden = true, notes = "外键")

  private Set<StorageKey> fKeys = new HashSet<StorageKey>();

  @ApiModelProperty(hidden = true)
  @JsonIgnore
  private DataSourceDto dataSourceDto;

  @ApiModelProperty(hidden = true)
  private Sensitivity sensitivity;

  private String note;

  @ApiModelProperty(hidden = true)
  private Indices indices;

  @ApiModelProperty(hidden = true)
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date lastModifiedTime;

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

  public Integer getLifeCycle() {
    return lifeCycle;
  }

  public void setLifeCycle(Integer lifeCycle) {
    this.lifeCycle = lifeCycle;
  }

  public String getCleanField() {
    return cleanField;
  }

  public void setCleanField(String cleanField) {
    this.cleanField = cleanField;
  }

  public BracketSourceCategory getBracketSourceCategory() {
    return bracketSourceCategory;
  }

  public void setBracketSourceCategory(
      BracketSourceCategory bracketSourceCategory) {
    this.bracketSourceCategory = bracketSourceCategory;
  }

  public boolean isSyncEntity() {
    return syncEntity;
  }

  public void setSyncEntity(boolean syncEntity) {
    this.syncEntity = syncEntity;
  }

  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getStoragePath() {
    return storagePath;
  }

  public void setStoragePath(String storagePath) {
    this.storagePath = storagePath;
  }

  public String getStoragePropsXml() {
    return storagePropsXml;
  }

  public void setStoragePropsXml(String storagePropsXml) {
    this.storagePropsXml = storagePropsXml;
  }

  public StorageProperties getStoragePropsJson() {
    return storagePropsJson;
  }

  public void setStoragePropsJson(StorageProperties storagePropsJson) {
    this.storagePropsJson = storagePropsJson;
  }

  public AvroSchema getAvroSchema() {
    return avroSchema;
  }

  public void setAvroSchema(AvroSchema avroSchema) {
    this.avroSchema = avroSchema;
  }

  public long getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(long storageSize) {
    this.storageSize = storageSize;
  }

  public int getStorageBlockResidualCount() {
    return storageBlockResidualCount;
  }

  public void setStorageBlockResidualCount(int storageBlockResidualCount) {
    this.storageBlockResidualCount = storageBlockResidualCount;
  }

  public Set<StorageColumn> getStorageColumns() {
    return storageColumns;
  }

  public void setStorageColumns(Set<StorageColumn> columns) {
    if (null == columns) {
      columns = new HashSet<StorageColumn>();
    }
    this.storageColumns = columns;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public DataSourceDto getDataSourceDto() {
    return dataSourceDto;
  }

  public void setDataSourceDto(DataSourceDto dataSourceDto) {
    this.dataSourceDto = dataSourceDto;
  }

  public Set<StorageIndex> getIndexes() {
    return indexes;
  }

  public Date getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public void setIndexes(Set<StorageIndex> indexes) {
    if (null == indexes) {
      indexes = new HashSet<StorageIndex>();
    }
    this.indexes = indexes;
  }

  public Sensitivity getSensitivity() {
    return sensitivity;
  }

  public void setSensitivity(Sensitivity sensitivity) {
    this.sensitivity = sensitivity;
  }

  public Set<StorageKey> getpKeys() {
    return pKeys;
  }

  public void setpKeys(Set<StorageKey> pKeys) {
    this.pKeys = pKeys;
  }

  public Set<StorageKey> getfKeys() {
    return fKeys;
  }

  public void setfKeys(Set<StorageKey> fKeys) {
    this.fKeys = fKeys;
  }

  public String getDdl() {
    return ddl;
  }

  public void setDdl(String ddl) {
    this.ddl = ddl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageEntity that = (StorageEntity) o;
    return Objects.equals(getName(), that.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public int compareTo(StorageEntity o) {
    return this.name.compareToIgnoreCase(o.getName());
  }
}
