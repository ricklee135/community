package rick.java.learning.javalearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description: javalearning
 * Created by lizhenguo on 2019/7/18 15:48
 */
@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name , Model model){
        model.addAttribute("name",name);
        return "hello";

    }
}
