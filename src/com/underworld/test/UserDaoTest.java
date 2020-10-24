package com.underworld.test;

import com.underworld.dao.UserDao;
import com.underworld.dao.impl.UserDaoImpl;
import com.underworld.domain.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void queryUserByUser() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.queryUserByUser("admin"));
    }

    @Test
    public void saveUser() {
        UserDao userDao = new UserDaoImpl();
        User user = new User(2,"admin1","admin1","admin@qq.com");
        System.out.println(userDao.saveUser(user));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.queryUserByUsernameAndPassword("admin","admin"));
    }
}