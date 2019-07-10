package com.jiayaxing.clouddemo.cloudorder.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "orderController",description = "订单访问接口")
@RequestMapping(value = "orderController")
public class OrderController {
    @ResponseBody
    @ApiOperation(value = "测试调用", notes = "返回调用orderController")
    @RequestMapping(value = "getName", method = RequestMethod.GET)
    public String getName() {

        return "调用orderController";
    }
}
