package org.datayoo.brackets.dto;

public enum DatabaseSourceType {
  /**
   * 数据库类型
   */
  UNKNOWN, SQLSERVER, ORACLE, MYSQL, HIVE, ACCESS, DB2, SQLLITE, POSTGRESQL, REDIS, ELASTICSEARCH, SPARKSQL;

  public static DatabaseSourceType getByJdbcName(String jdbcName) {
    switch (jdbcName) {
      case "hive2":
        return DatabaseSourceType.HIVE;
      case "mysql":
        return DatabaseSourceType.MYSQL;
      case "oracle":
        return DatabaseSourceType.ORACLE;
      case "postgresql":
        return DatabaseSourceType.POSTGRESQL;
      default:
        return null;
    }
  }
}
