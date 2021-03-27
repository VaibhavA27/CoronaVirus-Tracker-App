package io.javaproject.CoronaVirusTracker.controllers;

import io.javaproject.CoronaVirusTracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService CoronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute( "locationStats", CoronaVirusDataService.getAllStats());
        return "home";
    }
}
