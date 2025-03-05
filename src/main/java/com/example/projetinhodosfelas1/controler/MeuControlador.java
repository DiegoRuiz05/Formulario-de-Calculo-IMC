package com.example.projetinhodosfelas1.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeuControlador {

    @GetMapping("/hello")
    public String digaOla() {
        return "hello";
    }
}

















