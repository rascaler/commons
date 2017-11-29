package com.sky.commons.test.cotroller;

import com.sky.commons.web.annotation.OuterResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wurenqing
 * @Description:
 * @Date 2017/4/1 14:09
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    @OuterResponseBody
    String home() {
        return "Hello World!";
    }


}
