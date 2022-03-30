package com.xuan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangshixuan
 * @version 1.0
 * @Description:
 * @date 2022/3/30 9:17
 */
@Controller
@RequestMapping("/test")
public class JsonController {


    @RequestMapping("/test2")
    @ResponseBody
    public Map<String, Object> test2(){
        Map<String , Object> map = new HashMap<String ,Object>();
        map.put("id", "s20070");
        map.put("name", "zhangshixuan");
        return map;
    }

    @RequestMapping("/rest/{p1}/{p2}")
    @ResponseBody
    public Integer index(@PathVariable int p1, @PathVariable int p2){
        int result = p1+p2;
        //返回视图位置
        return result;
    }
}
