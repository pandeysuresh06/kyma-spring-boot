package com.example.simplespringbootapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SimpleRestController {


    @GetMapping(path="/hello-world")
    public String sayHello(){
        return new String("Testing SAP CI/CD application through KYMA");
    }
}
