package com.hendisantika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : thymeleaf-layout-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/08/21
 * Time: 08.02
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String homePage() {
        return "index";
    }

    @GetMapping("contact")
    public String contactPage() {
        return "contact";
    }

    @GetMapping("about")
    public String aboutPage() {
        return "about";
    }
}
