package com.xiaozhameng.web.exTest;

import com.xiaozhameng.base.BaseController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/10.
 */
@Controller
@EnableAutoConfiguration
public class SpringBootController extends BaseController{


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    @RequestMapping("/testPage")
    String testWebInfo(){
        logger.info("testPage");
        return "test";
    }

    @RequestMapping("/source")
    String source(){
        return "source";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootController.class, args);
    }

}
