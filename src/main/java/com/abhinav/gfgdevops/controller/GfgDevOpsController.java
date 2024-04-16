package com.abhinav.gfgdevops.controller;

import com.abhinav.gfgdevops.dto.ReqObj;
import org.springframework.web.bind.annotation.*;

@RestController
public class GfgDevOpsController {

    @GetMapping("/show")
    public String showMessage(){
        return "Hello, Abhinav!";
    }

    @PostMapping("/add")
    public int add(@RequestBody ReqObj reqObj){
        return (reqObj.getA()+reqObj.getB());
    }

    @PostMapping("/subtract")
    public int subtract(@RequestBody ReqObj reqObj){
        return (reqObj.getA()-reqObj.getB());
    }

    @PostMapping("/multiplication")
    public int multiplication(@RequestBody ReqObj reqObj){
        return (reqObj.getA()*reqObj.getB());
    }

    @PostMapping("/division")
    public int division(@RequestBody ReqObj reqObj){
        return (reqObj.getA()/reqObj.getB());
    }

    @GetMapping("/display")
    public String display(){
        return "Just a test to trigger jenkins";
    }
}
