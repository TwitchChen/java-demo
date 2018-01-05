package com.demo.bogo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fujingbo on 2017/12/11.
 */
@RestController
public class HelloController {

    @RequestMapping("/test")
    public String helloWorld(){
        return "hello world!";
    }
}
