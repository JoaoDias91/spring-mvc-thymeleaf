package br.com.alura.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model request){
        request.addAttribute("nome", "World!");
        return "hello";
    }
}
