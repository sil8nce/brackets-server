package org.datayoo.brackets.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.Validate;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hx on 16-11-29.
 */
@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataTableDto {

  @ApiModelProperty(
          value = "数据表名称"
  )
  private String tableName;

  @ApiModelProperty(
          value = "分区信息"
  )
  private List<TablePartition> tablePartitions;

  @ApiModelProperty(
          value = "元数据"
  )
  private ViewMetadata viewMetadata;

  @ApiModelProperty(
          value = "总数据量"
  )
  private long total;

  @ApiModelProperty(
          value = "数据内容"
  )
  private List<Object[]> rows = new LinkedList<>();

  public List<Object[]> getRows() {
    return rows;
  }

  public void setRows(List<Object[]> rows) {
    this.rows = rows;
  }

  public void addRow(Object[] row) {
    rows.add(row);
  }

  public ViewMetadata getViewMetadata() {
    return viewMetadata;
  }

  public void setViewMetadata(ViewMetadata viewMetadata) {
    this.viewMetadata = viewMetadata;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public List<TablePartition> getTablePartitions() {
    return tablePartitions;
  }

  public void setTablePartitions(List<TablePartition> tablePartitions) {
    this.tablePartitions = tablePartitions;
  }

  public  static class ViewMetadata{
    @ApiModelProperty(
            value = "列名",
            example = "col1,col2"
    )
    private String[] columns;

    @ApiModelProperty(
            value = "列名类型",
            example = "int,string"
    )
    private String[] columnsType;

    private int columnCount;
    @ApiModelProperty(
            value = "数据总数,分页使用"
    )
    private int total;

    public synchronized void addColumn(int columnIndex,String column) {
      Validate.notNull(column, "column is null!");
      Validate.isTrue(columnIndex<=columnCount);
      columns[columnIndex-1] = column;
    }
    public synchronized void addColumnType(int columnIndex,String column) {
      Validate.notNull(column, "columnsType is null!");
      Validate.isTrue(columnIndex<=columnCount);
      columnsType[columnIndex-1] = column;
    }
    public String[] getColumns() {
      return columns;
    }

    public void setColumns(String[] columns) {
      this.columns = columns;
    }

    public int getColumnCount() {
      return columnCount;
    }

    public void setColumnCount(int columnCount) {
      this.columnCount = columnCount;
      columns = new String[columnCount];
      columnsType = new String[columnCount];
    }

    public int getTotal() {
      return total;
    }

    public void setTotal(int total) {
      this.total = total;
    }

    public String[] getColumnsType() {
      return columnsType;
    }

    public void setColumnsType(String[] columnsType) {
      this.columnsType = columnsType;
    }
  }

}
