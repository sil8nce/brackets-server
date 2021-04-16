package org.datayoo.brackets.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;
import org.datayoo.brackets.domain.BracketSourceCategory;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSourceDto implements Serializable {

  @ApiModelProperty(value = "数据源编号", notes = "数据源的唯一标识，由后台生成", hidden = true)
  private String id;

  @ApiModelProperty(value = "数据源名称",
      required = true,
      example = "DATABASE数据源",
      notes = "唯一")
  private String name;

  @ApiModelProperty(value = "数据源别名", example = "hdfs", notes = "")
  private String alias;

  @ApiModelProperty(value = "数据源uri", example = "/xxx", notes = "")
  private String uri;

  @ApiModelProperty(value = "数据源类型",
      example = "FILESYSTEM",
      dataType = "org.datayoo.brackets.domain.BracketSourceCategory")
  private BracketSourceCategory dataStorageType = BracketSourceCategory.DATABASE;

  @ApiModelProperty(value = "jdbc连接模式",
      example = "DEFAULT",
      dataType = "org.datayoo.brackets.dto.JdbcConnType")
  private StorageConnType storageConnType = StorageConnType.DEFAULT;

  @ApiModelProperty(value = "数据源地址",
      required = true,
      example = "192.168.59.11",
      notes = "一般为IP地址")
  private String address;

  /**
   * DatabaseSourceType or FileSystemSourceType
   */
  @ApiModelProperty(value = "数据库类型",
      required = true,
      allowableValues = "SQLSERVER,ORACLE,MYSQL,HIVE,ACCESS,DB2,SQLLITE,POSTGRESQL,REDIS,ELASTICSEARCH,SPARKSQL",
      example = "ORACLE",
      notes = "一般为IP地址")
  private String dataSourceType;

  @ApiModelProperty(value = "端口", example = "8020")
  private int port;

  @ApiModelProperty(value = "实例名")
  private String instance;

  @ApiModelProperty(value = "用户名")
  private String userName;

  @ApiModelProperty(value = "密码")
  private String password;

  @ApiModelProperty(value = "连接字符串", hidden = true)
  private String connectionString;

  @ApiModelProperty(value = "选择器", hidden = true)
  @JsonIgnore
  private String serviceSelector;

  @ApiModelProperty(value = "集群名称", notes = "ES等集群名称", hidden = true)
  private String clusterName;

  @ApiModelProperty(value = "修改时间", hidden = true)
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date lastModifiedTime;

  @ApiModelProperty(value = "创建时间", hidden = true)
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createdTime;

  @ApiModelProperty(value = "其他属性")
  @JsonIgnore
  private String propsXml;

  @ApiModelProperty(value = "空间大小", hidden = true)
  @JsonIgnore
  private int spaceSize = 0;

  @ApiModelProperty(value = "角色", hidden = true)
  private String role;

  @ApiModelProperty(value = "创建人")
  private String creator;

  @ApiModelProperty(value = "实际路径", notes = "用于数据源类型为FILESYSTEM的数据源")
  private String realUrl;

  @ApiModelProperty(value = "Broker路径",
      notes = "用于数据源类型为FILESYSTEM的数据源",
      hidden = true)
  private String brokeUrl;

  @ApiModelProperty(value = "Broker路径", notes = "用于数据源类型为FILESYSTEM的数据源")
  private String broker;

  @ApiModelProperty(value = "描述", example = "描述", notes = "描述")
  private String note;

  @ApiModelProperty(value = "数据库驱动", example = "数据库驱动", notes = "数据库驱动")
  private String driverName;

  @ApiModelProperty(value = "配置文件")
  private Set<StorageConfig> configs = new HashSet<StorageConfig>();

  @ApiModelProperty(value = "数据库标签")
  private Set<StorageTag> tag = new HashSet<StorageTag>();

  private String factoryClass;

  public boolean checkDatabaseSourceType(DatabaseSourceType dataSourceType) {
    return String.valueOf(dataSourceType).equals(this.dataSourceType);
  }

  public boolean checkFileSystemSourceType(
      FilesSystemSourceType filesSystemSourceType) {
    return String.valueOf(filesSystemSourceType).equals(this.dataSourceType);
  }

  public String getFactoryClass() {
    return factoryClass;
  }

  public void setFactoryClass(String factoryClass) {
    this.factoryClass = factoryClass;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;

  }

  public String getId() {
    return id;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
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

  public Date getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public BracketSourceCategory getDataStorageType() {
    return dataStorageType;
  }

  public void setDataStorageType(BracketSourceCategory dataStorageType) {
    this.dataStorageType = dataStorageType;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDataSourceType() {
    return dataSourceType;
  }

  public void setDataSourceType(String dataSourceType) {
    this.dataSourceType = dataSourceType;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }

  public String getServiceSelector() {
    return serviceSelector;
  }

  public void setServiceSelector(String serviceSelector) {
    this.serviceSelector = serviceSelector;
  }

  public String getPropsXml() {
    return propsXml;
  }

  public void setPropsXml(String propsXml) {
    this.propsXml = propsXml;
  }

  public int getSpaceSize() {
    return spaceSize;
  }

  public void setSpaceSize(int spaceSize) {
    this.spaceSize = spaceSize;
  }

  public Set<StorageConfig> getConfigs() {
    return configs;
  }

  public void setConfigs(Set<StorageConfig> configs) {
    this.configs = configs;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getRealUrl() {
    return realUrl;
  }

  public void setRealUrl(String realUrl) {
    this.realUrl = realUrl;
  }

  public String getBrokeUrl() {

    if (StringUtils.isEmpty(brokeUrl)) {
      if (!StringUtils.isEmpty(broker)) {
        if (dataStorageType == BracketSourceCategory.FILESYSTEM) {
          brokeUrl =
              FilesSystemSourceType.valueOf(dataSourceType).getSchema() + "://"
                  + broker + "/";
        }

        return brokeUrl;
      }
    }
    return brokeUrl;
  }

  public void setBrokeUrl(String brokeUrl) {
    this.brokeUrl = brokeUrl;
  }

  public String getBroker() {
    return broker;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public void setBroker(String broker) {
    this.broker = broker;
  }

  public void addConfig(StorageConfig config) {
    if (this.configs == null)
      this.configs = new HashSet<StorageConfig>();
    configs.add(config);
  }

  public void addTag(StorageTag tags) {
    if (this.tag == null)
      this.tag = new HashSet<StorageTag>();
    tag.add(tags);
  }

  public StorageConnType getStorageConnType() {
    return storageConnType;
  }

  public void setStorageConnType(StorageConnType storageConnType) {
    this.storageConnType = storageConnType;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public Set<StorageTag> getTag() {
    return tag;
  }

  public void setTag(Set<StorageTag> tag) {
    this.tag = tag;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }
}
