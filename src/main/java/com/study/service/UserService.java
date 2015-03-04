package com.study.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.UserDao;

@Service
public class UserService {
//    @Resource(name="userDao")
//    private UserDao userDao;
    @Autowired
    private UserDao userDao;
    
    public HashMap<String, Object> selectUserInfo(HashMap<String, Object> paramMap) throws Exception{
        return userDao.selectUserInfo(paramMap);
    }
    
}
