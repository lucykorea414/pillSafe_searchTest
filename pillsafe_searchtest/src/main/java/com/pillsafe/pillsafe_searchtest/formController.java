package com.pillsafe.pillsafe_searchtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formController {
    @GetMapping("/form")
    public String form(){ return "form"; }

    @GetMapping("/formSuccess")
    public String formSuccess(){ return "formSuccess"; }

}
