package com.underworld.dao;

import com.underworld.domain.User;

public interface UserDao {
    //根据用户名查询用户信息
    public User queryUserByUser(String username);

    //保存用户信息
    public int saveUser(User user);

    //登录操作
    public User queryUserByUsernameAndPassword(String username,String password);
}
