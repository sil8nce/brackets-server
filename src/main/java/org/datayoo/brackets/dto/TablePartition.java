package org.datayoo.brackets.dto;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class TablePartition implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分区名称
     */
    protected String name;

    /**
     * 分区值
     */
    protected String value;

    protected List<TablePartition> subPartitions = new LinkedList<TablePartition>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<TablePartition> getSubPartitions() {
        return subPartitions;
    }

    public void setSubPartitions(List<TablePartition> subPartitions) {
        this.subPartitions = subPartitions;
    }

    public void addTablePartition(TablePartition subPartition) {
        if (subPartitions == null) {
            subPartitions = new LinkedList<TablePartition>();
        }
        subPartitions.add(subPartition);
    }

}
