package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/greetings")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {
            return " <img src='https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQueNxRcivgr14ygyBex2c4XPVx6SBlS3QD4Cfbmqyiqe1CjEFh '> ";
        };
    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctor10() {
            return "<img src='http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcTPGn6aRkj3jPN3n2VXVwvQjerCcT31FohShBh_bLPayl28BfAb-Qas0jGi4jndux1f'>";
        };
     @GetMapping("/doctor/14")
     @ResponseBody
    public String doctor14() {
            return "<img src=\"https://upload.wikimedia.org/wikipedia/commons/7/72/Jodie_Whittaker_by_Gage_Skidmore.jpg\">";
        };
       
    }
