package com.example.Evaluacion;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="/")
public class Controller {
    @GetMapping(path="/")
    public String home(){
        return "A18105615-Dulanto Valeria";
    }
    @GetMapping(path="/codigo")
    public String home(){
        return "A18105615";
    }
    @GetMapping(path="/idat/nombre-completo")
    public String home(){
        return "Dulanto Valeria";
    }
}
