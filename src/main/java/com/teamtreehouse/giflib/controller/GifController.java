package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jaybob320 on 2/5/16.
 */
@Controller
public class GifController {

    @RequestMapping("/")
    @ResponseBody
    public String listGifs(){
        return "List of all the GIFs";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String oneGif(){
        return "This is a single gif :)";
    }

}
