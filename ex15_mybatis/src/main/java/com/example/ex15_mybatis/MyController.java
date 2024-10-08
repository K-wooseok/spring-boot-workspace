package com.example.ex15_mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ex15_mybatis.jdbc.MyUserDAO;


@Controller
public class MyController {
    
    @Autowired
    private MyUserDAO myUserDAO;

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception {
        return "MyBatis 사용하기";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping(value = "/user")
    public String userlistPage(Model model) {
        model.addAttribute("users", myUserDAO.list());
        return "userlist";
    }
}
