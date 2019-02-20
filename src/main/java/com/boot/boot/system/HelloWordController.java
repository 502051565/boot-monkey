package com.boot.boot.system;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author monkey_lwy@163.com
 * @date 2019-02-20 15:09
 * @desc
 */
@RestController
@RequestMapping("/hello")
public class HelloWordController {

    @RequestMapping(value="/index",method=RequestMethod.GET)
    public String index(){
        return "hello";
    }

}
