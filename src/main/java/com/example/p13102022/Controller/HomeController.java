package com.example.p13102022.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
  @GetMapping("/create")
  public String index(){
    return "index";
  }

  @PostMapping("/create")
  public String create(WebRequest payload){
    return "redirect:/";

  }
}
