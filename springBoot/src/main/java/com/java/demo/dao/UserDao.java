package com.java.demo.dao;

import com.java.demo.common.BaseRepository;
import com.java.demo.entry.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by GaoTao on 2017/12/17.
 */
@Repository
public interface UserDao extends BaseRepository<User, String> {

        User findById(Long id);

        User findByUserName(String userName);

}
