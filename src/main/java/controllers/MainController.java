package controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController
{

    @RequestMapping("/reconfigure")
    public String reconfigure()
    {
        return "Reconfigure!";
    }
}