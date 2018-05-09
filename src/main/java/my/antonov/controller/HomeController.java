package my.antonov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alex on 01.05.2018.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

}
