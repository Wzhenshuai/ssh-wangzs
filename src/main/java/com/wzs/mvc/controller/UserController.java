package com.wzs.mvc.controller;

import com.wzs.mvc.entity.User;
import com.wzs.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/showname",method= RequestMethod.GET)
    public String showUserName(@RequestParam("uid") int uid, HttpServletRequest request, Model model){
        System.out.println("showname");
        User user = userService.selectByPrimaryKey(uid);
        if(user != null){
            request.setAttribute("name", user.getUserName());
            model.addAttribute("mame", user.getUserName());
            return "showName";
        }
        request.setAttribute("error", "没有找到该用户！");
        return "error";
    }
}
