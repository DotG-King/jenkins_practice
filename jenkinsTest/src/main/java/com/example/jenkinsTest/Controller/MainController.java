package com.example.jenkinsTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value="")
public class MainController {
    MessageArray ma = new MessageArray();

    @GetMapping
    public String list(Model model) {
        ArrayList<String> message = ma.printArray();
        model.addAttribute("array", message);
        return "main";
    }

    @PostMapping
    public String post(@RequestParam("message") String message, Model model) {
        ma.addArray(message);
        ArrayList<String> al = ma.printArray();
        model.addAttribute("array", al);

        return list(model);
    }
}
