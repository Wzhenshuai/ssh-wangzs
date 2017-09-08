package com.wzs.mvc.service.impl;

import com.wzs.mvc.entity.User;
import com.wzs.mvc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/6 0006.
 */

public class UserServiceTest2 {

    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) application.getBean("userService");
        User user = service.selectByPrimaryKey(1);
        System.out.println(user.getUserName());
    }
}
