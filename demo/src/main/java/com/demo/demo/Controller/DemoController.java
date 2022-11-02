package com.demo.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.Service.DemoService;

@RestController
public class DemoController {
    
    @Autowired
    private DemoService demoService;

    @GetMapping("/input")
    public String showInput()
    {
        return demoService.showInput();
    }

    @PostMapping("/input")
    public void takeInput(@RequestBody String ip)
    {
        demoService.saveInput(ip);
        return;
    }
}
