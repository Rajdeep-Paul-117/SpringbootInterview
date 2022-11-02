package com.demo.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private String userInput;

    public void saveInput(String input)
    {
        this.userInput=input;        
    }
    public String showInput()
    {
        return this.userInput;
    }
}
