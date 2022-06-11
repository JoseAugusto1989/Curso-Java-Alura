package com.ciandt.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

    @GetMapping("/list")
    public ModelAndView getList() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

}
