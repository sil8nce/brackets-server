package org.datayoo.brackets.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.datayoo.brackets.domain.BracketSourceCategory;
import org.datayoo.brackets.dto.DatabaseSourceType;
import org.datayoo.brackets.dto.FilesSystemSourceType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName DicController
 * @Description 字典数据
 * @Author BLADE
 * @Date 4/14/2021 5:29 PM
 * @Version 1.0
 **/
@Api(tags = "字典数据模块")
@RequestMapping("/dic")
@RestController
public class DicController extends BaseController {

  @ApiOperation(value = "获取数据源类型", notes = "获取数据源类型", response = List.class)
  @GetMapping("/listSourceCategory")
  @ResponseStatus
  public ResponseEntity<List> getSourceCategory() throws Exception {
    List storageTypes = Arrays.asList(BracketSourceCategory.values());
    return ok(storageTypes);
  }

  @ApiOperation(value = "获取数据库类型", notes = "获取数据库类型", response = List.class)
  @GetMapping("/listDataBaseType")
  @ResponseStatus
  public ResponseEntity<List<DatabaseSourceType>> getDataBaseType() {
    List<DatabaseSourceType> databaseSourceTypes = Arrays
        .asList(DatabaseSourceType.values());
    return ok(databaseSourceTypes);
  }

  @ApiOperation(value = "获取文件系统类型", notes = "获取文件系统类型", response = List.class)
  @GetMapping("/listFileSystemType")
  @ResponseStatus
  public ResponseEntity<List<FilesSystemSourceType>> getFileSystemType() {
    //先暂定hdfs
    List<FilesSystemSourceType> filesSystemSourceTypes = Arrays
        .asList(FilesSystemSourceType.HDFS);
    return ok(filesSystemSourceTypes);
  }
}
