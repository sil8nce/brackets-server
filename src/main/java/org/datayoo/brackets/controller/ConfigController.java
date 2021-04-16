package org.datayoo.brackets.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author BLADE
 * @Date 4/15/2021 2:02 PM
 * @Version 1.0
 **/
@Api(tags = "配置文件管理模块")
@RequestMapping("/config")
@RestController
public class ConfigController extends BaseController {

}
