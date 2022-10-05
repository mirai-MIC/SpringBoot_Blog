package com.spring.Main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2022-10-05
 * FileName: IndexController
 * Author:   mirai
 * Date:     2022/10/5 18:02
 * Description:
 * @author mirai
 */

@Controller
public class IndexController {
    @RequestMapping(value = "index")
    public String getIndex() {
        return "index";
    }
}
