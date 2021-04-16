package org.datayoo.brackets.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FileSystemController
 * @Description 文件系统
 * @Author BLADE
 * @Date 4/12/2021 4:29 PM
 * @Version 1.0
 **/
@Api(tags = "文件系统模块")
@RequestMapping("/fileSystem")
@RestController
public class FileSystemController extends BaseController{
  // 目录查询

  // 上传配置文件

  // 导出配置文件

  // 浏览文件 根据url查询一次schema，如果有匹配后格式化输出
  // 文件系统中可能会包含多种文件格式，为每个文件单独添加schema
}
