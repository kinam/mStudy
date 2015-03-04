package com.study.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {  // extends SqlSessionDaoSupport
    @Autowired 
    private SqlSessionTemplate session; 
    
    /** 사용자 정보 조회 */
    public HashMap<String, Object> selectUserInfo(HashMap<String, Object> paramMap) throws Exception {
        return session.selectOne("user.selectUserInfo", paramMap);
    }
}