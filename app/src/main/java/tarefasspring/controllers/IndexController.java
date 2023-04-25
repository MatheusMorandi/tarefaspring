package tarefasspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
public class IndexController {

    @RequestMapping("/")

    public String home() {

        return "home.jsp";

    }    
    
}
