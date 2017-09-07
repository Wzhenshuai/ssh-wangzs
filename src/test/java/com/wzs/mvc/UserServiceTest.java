package com.wzs.mvc;

import com.wzs.mvc.entity.User;
import com.wzs.mvc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/9/6 0006.
 */

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)

// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    public UserService userService;

    @Test
    public void getUserTest(){
        User user = userService.selectByPrimaryKey(1);
        System.out.println(user.getUserName());
    }

}
