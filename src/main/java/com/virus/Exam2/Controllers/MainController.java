package com.virus.Exam2.Controllers;

import com.virus.Exam2.Models.VirusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    VirusRepo virusRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView ModelView = new ModelAndView("index");
        ModelView.addObject("viruslist", virusRepo.findAll());

        return ModelView;
    }
}
