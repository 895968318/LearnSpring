package com.mzw.service.impl;

import com.mzw.bean.User;
import com.mzw.dao.UserDao;
import com.mzw.dao.impl.UserDaoImpl;
import com.mzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserDao userDao = new UserDaoImpl();

    @Override
    public int insert(User user) {
       return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int deleteById(int id) {
        return userDao.deleteById(id);
    }

    @Override
    public User selectById(int id) {
        return userDao.selectById(id);
    }

    @Override
    public int[] insertBatch(List<User> userList) {
        return userDao.insertBatch(userList);
    }

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }

    @Override
    public int count() {
        return userDao.count();
    }
}
