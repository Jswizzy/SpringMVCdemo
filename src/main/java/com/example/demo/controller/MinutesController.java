package com.example.demo.controller;

import com.example.demo.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping("/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {

        System.out.println("Exercise: " + exercise.getMinutes());

        return "addMinutes";
        //return "forward:addMoreMinutes.html"; //key to view file

        //forward: keep request open
        //redirect: close old request and open new request
    }

/*    @RequestMapping("/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {

        System.out.println("Exercising: " + exercise.getMinutes());

        return "addMinutes"; //key to view file
    }*/
}
