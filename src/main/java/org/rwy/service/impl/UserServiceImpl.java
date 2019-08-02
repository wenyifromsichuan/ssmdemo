package org.rwy.service.impl;

import org.rwy.dao.UserDao;
import org.rwy.entity.User;
import org.rwy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public void insertUser(User user) {
        System.out.println("service插入数据");
        dao.insertUser(user);
    }

    @Override
    public List<User> queryAll() {
        System.out.println("service查询全部数据");
        return dao.queryAll();
    }
}
