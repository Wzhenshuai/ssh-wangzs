package com.wzs.mvc.service.impl;

import com.wzs.mvc.dao.UserDao;
import com.wzs.mvc.entity.User;
import com.wzs.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User selectByPrimaryKey(Integer id){
        return userDao.selectByPrimaryKey(id);
    }
}
