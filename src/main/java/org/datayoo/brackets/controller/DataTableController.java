package org.datayoo.brackets.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.datayoo.brackets.dto.StorageEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName DataTableController
 * @Description 字段、
 * @Author BLADE
 * @Date 4/15/2021 2:03 PM
 * @Version 1.0
 **/
@Api(tags = "数据库表管理模块")
@RequestMapping("/dataTable")
@RestController
public class DataTableController extends BaseController {
  /**
   * 表操作
   */
  @ApiOperation(value = "新增表", notes = "新建数据库表", response = Map.class)
  @PostMapping
  @ResponseStatus
  public ResponseEntity<StorageEntity> createStorageEntity(
      @ApiParam(value = "数据库表实体") @RequestBody StorageEntity entity,
      @ApiParam(value = "数据源Id", required = true) @RequestParam
          String datasourceId) {

    return ok(entity);
  }

  @ApiOperation(value = "删除数据库数据表",
      notes = "通过数据表名称删除数据表",
      response = Integer.class)
  @DeleteMapping("/{datasourceId}")
  @ResponseStatus
  public ResponseEntity<Integer> deleteStorageEntity(
      @ApiParam(value = "数据源id") @PathVariable String datasourceId,
      @ApiParam(value = "表名称", required = true) @RequestParam
          String tableName) {
    return null;
  }

  @ApiOperation(value = "修改数据库表",
      notes = "更新数据库表",
      response = StorageEntity.class)
  @PutMapping("/{datasourceId}")
  public ResponseEntity<StorageEntity> updateStorageEntity(
      @RequestBody List<StorageEntity> tables,
      @PathVariable String datasourceId) {

    return null;
  }

  @ApiOperation(value = "获取列集", notes = "获取列集", response = Map.class)
  @GetMapping("/columns")
  @ResponseStatus
  public ResponseEntity<StorageEntity> getColumns(
      @ApiParam(value = "数据源Id", required = true) @RequestParam
          String datasourceId,
      @ApiParam(value = "表名称", required = true) @RequestParam String tableName,
      @ApiParam(value = "是否查询主外键") @RequestParam(required = false)
          boolean isPFKey) {

    return null;
  }

  /**
   * 视图操作
   * 没有新增视图
   */
  @ApiOperation(value = "获取视图", notes = "表视图", response = Map.class)
  @GetMapping("/views")
  @ResponseStatus
  public ResponseEntity<Map<String, Set<String>>> getTableViews(
      @ApiParam(value = "数据源Id") @RequestParam String datasourceId) {
    return null;
  }

  @ApiOperation(value = "删除数据库视图表",
      notes = "删除数据库视图表",
      response = Integer.class)
  @DeleteMapping("/view/{datasourceId}")
  @ResponseStatus
  public ResponseEntity<Integer> deleteStorageView(
      @ApiParam(value = "数据源id") @PathVariable String datasourceId,
      @ApiParam(value = "视图名称") @RequestParam String viewName) {

    return null;
  }

  // 列集

  // 索引

  // 主键

  // 外键

  // 列集

}
