package com.coco.cocochi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MemberController {
    @GetMapping("/login")
    public String login(){

        return "";
    }

    @GetMapping("/join")
    public String join(){

        return "";
    }
}