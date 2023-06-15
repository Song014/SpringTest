package com.hr.project.controller;

import com.hr.project.service.User;
import com.hr.project.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private User user;

    @RequestMapping("/")
    public String homeCon(){

        return "index";
    }

    @ResponseBody
    @PostMapping("/test")
    public HashMap<String, Object> test(){
        HashMap<String, Object> map = new HashMap<>();

        List<UserVO> list = user.getUser();
        map.put("list", list);

        return map;
    }
}
