package com.zuehlke;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fro on 10.05.2017.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }
}
