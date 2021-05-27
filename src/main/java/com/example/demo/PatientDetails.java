package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class PatientDetails {
    // @RequestMapping("/")
    // public ModelAndView home()
    // {
    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.setViewName("patientform");
    //     return modelAndView;
    // }
    @RequestMapping("/form")
    public String patientForm()
    {
        return "patientform";
    }
}