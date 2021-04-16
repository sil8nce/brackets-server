package org.datayoo.brackets.dto;

public enum FilesSystemSourceType {

    //LOCAL,
    HDFS("hdfs"),
    HBFS("hbfs"),
    FTP("ftp");

    private String schema;

    FilesSystemSourceType(String schema) {
        this.schema=schema;
    }

    public String getSchema() {
        return schema;
    }

}
