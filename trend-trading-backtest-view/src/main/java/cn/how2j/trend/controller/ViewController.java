package cn.how2j.trend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
  *
  * @author xiekaikai
  * @date 2019-09-17 22:35
  */
@Controller
public class ViewController {
    @GetMapping("/")
    public String view() throws Exception {
        return "view";
    }
}