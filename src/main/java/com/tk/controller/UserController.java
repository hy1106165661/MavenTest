package com.tk.controller;

import com.tk.entity.TUser;
import com.tk.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/user")
public class UserController {
    private Logger log = LogManager.getLogger("UserController");
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "userList";
    }

    @RequestMapping("/select/{id}")
    public @ResponseBody String selectByPrimaryKey(@PathVariable("id") Integer id){
        TUser user =userService.selectByPrimaryKey(id);
        log.info(user.getId());
        log.info(user.getName());
        log.info(user.getPassword());
        log.info(user.getPhone());

        return "dddddddddddddd";
    }
}
