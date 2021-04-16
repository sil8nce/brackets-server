package org.datayoo.brackets.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.datayoo.base.types.DataTypeName;
import org.datayoo.brackets.domain.BracketSourceCategory;
import org.datayoo.brackets.dto.DataSourceDto;
import org.datayoo.brackets.dto.DataSourceQueryDto;
import org.datayoo.brackets.rdb.RdbSource;
import org.datayoo.configx.parameter.GroupParameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName DataSourceController
 * @Description 数据库源管理模块
 * @Author BLADE
 * @Date 2021/4/7 0:10
 * @Version 1.0
 **/
@Api(tags = "数据库源管理模块")
@RequestMapping("/dataSource")
@RestController
public class DataSourceController extends BaseController {

  @ApiOperation(value = "获取数据库源管理配置信息",
      notes = "获取数据库源管理配置信息",
      response = String.class)
  @GetMapping("dataSourceConfig")
  @ResponseStatus
  public ResponseEntity<String> getDatasourceConfig(
      @ApiParam(value = "数据源类型") @RequestParam
          BracketSourceCategory bracketSourceCategory) {

    return null;
  }

  @ApiOperation(value = "创建数据源", response = DataSourceDto.class)
  @PostMapping
  public ResponseEntity<DataSourceDto> createDataSource(
      @ModelAttribute DataSourceDto dataSource) {
    // 数据源配置
    GroupParameter groupParameter = new GroupParameter();
    groupParameter.setDataType(DataTypeName.String);
    RdbSource rdbSource = new RdbSource(groupParameter);
    return null;
  }

  @ApiOperation(value = "删除数据源")
  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Integer> deleteDataSource(
      @ApiParam(value = "id", required = true) @PathVariable String id) {

    return ok(0);
  }

  @ApiOperation(value = "修改数据源")
  @PutMapping("/{id}")
  public ResponseEntity<DataSourceDto> updateDataSource(
      @ApiParam(value = "id") @PathVariable String id,
      @ModelAttribute DataSourceDto dataSourceDto) {

    return null;
  }

  @ApiOperation(value = "查询所有数据源", response = List.class)
  @GetMapping
  public ResponseEntity<List<DataSourceDto>> query(
      @ModelAttribute DataSourceQueryDto dataSourceQueryDto) {

    return null;
  }

  @ApiOperation(value = "获取数据源连接状态",
      notes = "更新数据源信息获取数据源的连接状态",
      response = Boolean.class)
  @RequestMapping(value = "/connStatus", method = RequestMethod.POST)
  @PostMapping
  public ResponseEntity<String> getConnectionStatus(
      @ApiParam(value = "数据源实体") @RequestBody DataSourceDto dataSourceDto) {

    return null;
  }

}
