package com.example.springdeploy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${app.message}")
    String message;

    @GetMapping("/")
    public String helloWorld() {
        return message;
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name) {

        if (name.toLowerCase() == "miriam") {
            return "Eii.. " + name + " No te quiero ni ver!!! Fuera...\n\n Has dicho que Telegram es una caca....";
        }

        return "Hola, "+name+" ¿Cómo estás?";
    }
}
