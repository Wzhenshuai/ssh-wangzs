package com.wzs.mvc.service;

import com.wzs.mvc.entity.User;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
public interface UserService {
    User selectByPrimaryKey(Integer id);
}
