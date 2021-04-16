package org.datayoo.brackets.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.datayoo.brackets.dto.DataTableDto;
import org.datayoo.brackets.dto.SqlQueryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName DataController
 * @Description 数据查询控制器
 * @Author BLADE
 * @Date 2021/4/8 17:54
 * @Version 1.0
 **/
@Api(tags = "数据管理模块")
@RequestMapping("/data")
@RestController
public class DataController extends BaseController {

  /**
   * 默认限制条数
   */
  private static final int DEFAULT_LIMIT = 1000;

  /**
   * 根据sql查询
   */
  @ApiOperation(value = "根据sql查询数据",
      notes = "根据sql查询数据(条数限制)",
      response = DataTableDto.class)
  @PostMapping(value = "/sql/{datasourceId}")
  @ResponseStatus
  public ResponseEntity<DataTableDto> querySqlData(
      @ApiParam(value = "数据库id") @PathVariable String datasourceId,
      @RequestBody SqlQueryDto sqlQueryDto) {

    return null;
  }

  /**
   * 表数据查看，可配置分页条数
   */
  @ApiOperation(value = "查询表数据",
      notes = "通过表名查询数据库数据",
      response = DataTableDto.class)
  @GetMapping("/table/{datasourceId}")
  @ResponseStatus
  public ResponseEntity<DataTableDto> queryTableDatasGet(
      @ApiParam(value = "数据源id") @PathVariable String datasourceId,
      @ApiParam(value = "展示数据条数") @RequestParam(required = false)
          int requestSize,
      @ApiParam(value = "表名称", required = true) @RequestParam String tableName,
      @ApiParam(value = "条件") @RequestParam(required = false)
          String condition) {
    requestSize = DEFAULT_LIMIT;

    return null;
  }

  @ApiOperation(value = "表数据导出CSV文件", notes = "表数据导出CSV文件")
  @GetMapping(value = "/tableDataExport/{datasourceId}/{tableName}")
  @ResponseStatus
  public ResponseEntity<Void> tableDataExport(
      @ApiParam(value = "数据源id") @PathVariable String datasourceId,
      @ApiParam(value = "表名") @PathVariable String tableName,
      @ApiParam(value = "数据条数") @RequestParam(required = false) Integer size,
      HttpServletResponse response) {
    StringBuilder sql = new StringBuilder("select * from ");
    return v();
  }

  /**
   * 查询结果导出
   */
  @ApiOperation(value = "导出sql查询数据", notes = "导出sql查询数据")
  @GetMapping(value = "/sqlDataExport")
  @ResponseStatus
  public ResponseEntity<Void> exportSqlData(
      @ApiParam(value = "数据源Id", required = true) @RequestParam
          String datasourceId,
      @ApiParam(value = "表名", required = true) @RequestParam String tableName,
      @ApiParam(value = "SQL", required = true) @RequestParam String sql,
      HttpServletResponse response) {

    return v();
  }

  // 全部的原生 索引、主键、外键、列集（service与data分开，但是controller共用）， 如果添加了schema要根据schema做响应的描述

}
