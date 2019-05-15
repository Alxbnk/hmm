package com.example.rentse.Controllers;

import com.example.rentse.Models.SE;
import com.example.rentse.Services.SeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class HomeController {

    @Autowired
    SeService seService;

    Logger log = Logger.getLogger(HomeController.class.getName());



    private final String INDEX = "index";



    @GetMapping("/")
    public String index(Model model){
        log.info("Index action called... ");

        //List<Event> e = eventService.getEvents();
        //seService.getSE(model);
        List<SE> SE = seService.getSE();
        model.addAttribute("SE", SE);



        return INDEX;
    }
}
