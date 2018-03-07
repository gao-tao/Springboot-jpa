package com.java.demo.Service;

import com.java.demo.dao.UserDao;
import com.java.demo.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GaoTao on 2017/12/19.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> find(){
      return  userDao.findAll();
    }
}
